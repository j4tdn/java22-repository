package connection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.xml.sax.InputSource;

public class DbProvider {
	
private static String DB_CONFIG_PATH = "config.properties";
	
	private DbProvider() {
		
	}
	
	public static Properties getProperties() {
		Properties properties = new Properties();
		
		try {
			ClassLoader classLoader = DbProvider.class.getClassLoader();
			properties.load(DbProvider.class.getClassLoader().getResourceAsStream(DB_CONFIG_PATH));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return properties;
	}
}
