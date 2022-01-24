package com.orangehrms.framework;

import org.apache.commons.configuration2.CompositeConfiguration;
import org.apache.commons.configuration2.SystemConfiguration;

public class ConfigProperties {
	
	private static CompositeConfiguration config;
	private ConfigProperties() {
	    throw new IllegalStateException("ConfigProperties class");
	  }
    

    public static void loadProperty(String filePath) throws Exception{
          if (config == null) {
                config = new CompositeConfiguration();
                config.addConfiguration(new SystemConfiguration());
          }
          config.addConfiguration(new Configurations().properties(filePath));
    }

    public static String get(String key) throws Exception {
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

}
