package com.orangehrms.pages;

import org.apache.commons.configuration2.CompositeConfiguration;
import org.apache.commons.configuration2.SystemConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;


public class Compositefile {
	
	
	//private static CompositeConfiguration config;

	private void ConfigProperties() {
		throw new IllegalStateException("ConfigProperties class");
	}

	public static void loadProperty(String filePath) {

		
CompositeConfiguration config = new Com
		
		if (config == null) {
			
			
			
/*
			CompositeConfiguration config = new CompositeConfiguration();
			config.addConfiguration(new SystemConfiguration());*/
		}

		try {
			config.addConfiguration(new Configurations().properties(filePath));
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String get(String key) throws Exception{
		String value;
		if ((value = config.getString(key)) != null) {
			return value;
		}
		
		throw new Exception("Property " + key + " Not Found for !!");

	}
	 public static void setProperties(String key, String value) {
         config.setProperty(key, value);
   }

}

