/**************************************************************************
 * Licensed Material - Dawn InfoTek Inc.                                  *
 * Copyright (c) Dawn InfoTek Inc. 1999, 2005, 2018 - All rights reserved.*
 * (<http://www.dawninfotek.com>)                                         *
 *                                                                        *
 **************************************************************************/

package com.dawninfotek.logplus.web;


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.dawninfotek.logplus.extension.log4j12.Log4jConfigChangeWatcherService;

/**
 * A Listener to start and stop a service to monitor and reload the change of log4j configuration.   
 * This Context Listener only can be used under the container is running on java 1.7 or later version. 
 */

public class Log4jConfigMonitorContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent arg0) {		
		System.out.println("Starting to watch Log4j configuration change:" + Log4jConfigChangeWatcherService.getInstance().startMonitoring());

	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("Stopping to watch Log4j configuration change:" + Log4jConfigChangeWatcherService.getInstance().stopMnitoring());
	}

}
