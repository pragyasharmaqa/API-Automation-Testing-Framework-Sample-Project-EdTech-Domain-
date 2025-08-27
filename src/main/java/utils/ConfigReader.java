package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

	static Properties props;
	
	static {
		try {
			props = new Properties();
			FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
			props.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public static String get(String key) {
		return props.getProperty(key);
	}
}
