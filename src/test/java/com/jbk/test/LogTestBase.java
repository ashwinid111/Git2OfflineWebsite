package com.jbk.test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogTestBase {
	public Logger logger;
	//= Logger.getLogger(UsefulLinksTest.class);
public Logger testLog(){
	logger= Logger.getLogger(this.getClass());
	String path=(System.getProperty("user.dir") +"/src/main/resources"+"/usefulTest.properties");
PropertyConfigurator.configure(path);	
	return logger;
}
}
