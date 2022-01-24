package driverEngine;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.SystemConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class CompositeConfiguartion {

	public static CompositeConfiguration config;

	public CompositeConfiguartion() {

		throw new IllegalStateException("ConfigProperties class");

	}

	public static void loadProperty(String filePath) {

		if (config == null) {

			config = new CompositeConfiguration();

			config.addConfiguration(new SystemConfiguration());

		}

		try {
			config.addConfiguration((Configuration) new Configurations().properties(filePath));
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static String get(String key) throws Exception {
		String value;

		if ((value = config.getString(key)) != null) {
			return value;
		}

		throw new Exception("The Property" + key + " " + "not found");
	}

	public static void setProperty(String key, String value) {
		config.setProperty(key, value);
	}

}
