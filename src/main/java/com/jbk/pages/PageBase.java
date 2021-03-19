package com.jbk.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PageBase {
	public Logger logger;
	//= Logger.getLogger(UsefulLinksTest.class);
public Logger pageLog(){
	logger= Logger.getLogger(this.getClass());
	String path=(System.getProperty("user.dir") +"/src/main/resources"+"/usefulPage.properties");
PropertyConfigurator.configure(path);	
	return logger;
}

}