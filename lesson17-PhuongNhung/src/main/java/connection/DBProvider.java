package connection;

import java.io.IOException;
import java.util.Properties;

public class DBProvider {
	private  static String DB_CONFIG_PATH = "config.properties";
	private DBProvider() {
	}
	public static Properties getProperties() {
		Properties properties = new Properties();
		 
		try {
			ClassLoader classLoader = DBProvider.class.getClassLoader();
			properties.load(classLoader.getResourceAsStream(DB_CONFIG_PATH));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return properties;
	}
}
