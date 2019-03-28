/**************************************************************************
 * Licensed Material - Dawn InfoTek Inc.                                  *
 * Copyright (c) Dawn InfoTek Inc. 1999, 2005, 2018 - All rights reserved.*
 * (<http://www.dawninfotek.com>)                                         *
 *                                                                        *
 **************************************************************************/

package com.dawninfotek.logplus.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.dawninfotek.logplus.config.Configuration;
import com.dawninfotek.logplus.core.LogPlusContext;
import com.dawninfotek.logplus.util.LogPlusUtils;

@WebListener
public class LogPlusWebContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		LogPlusContext.eventService().logApplicationStateChangeEventEnd(LogPlusUtils.getLogProperty("applicationName", ""), null);
	}

	@Override
	public void contextInitialized(ServletContextEvent contextEvent) {
		//initialize the LogPlus system after web container loaded//	
		String f = contextEvent.getServletContext().getInitParameter("logplus-config-file");
		if(f == null) {
			//use default
			f = Configuration.logplusConfigFile;
		}
				
		LogPlusContext.initialize(f);		
		
		//log application startup
		LogPlusContext.eventService().logApplicationStateChangeEventBegin(LogPlusUtils.getLogProperty("applicationName", ""), null);
	}

}
