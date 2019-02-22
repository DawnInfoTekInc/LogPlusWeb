# Log Plus Web

LogPlusWeb is an component to extend LogPlus framework, The goal of LogPlusWeb is to support web filter and listener.
see [LogPlus](https://github.com/DawnInfoTekInc/LogPlus)

## features
1. integrate with servlet, extend servlet dofilter [dofilter function](https://tomcat.apache.org/tomcat-5.5-doc/servletapi/javax/servlet/Filter.html) to get extra message from http request
2. extend servlet listener for java web application (war, ear, springboot, etc...)

## usage
1. requirement:
    1. logplus-core, logplus-core required libs see [LogPlus](https://github.com/DawnInfoTekInc/LogPlus)
    
2. configuration:
    1. [web.xml](web.xml) file, add listener, filter, filter-mapping, context-param for customized config


## License

see the [LICENSE](LICENSE) file for license rights and limitations (GNU GPLv3)
