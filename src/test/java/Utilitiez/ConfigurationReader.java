package Utilitiez;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
		
	private static Properties properties; 
	
	
	static {
		
		try{
			
			String filePath = Constants.confiProperty_filePath;
			FileInputStream fis = 
					new FileInputStream(filePath);
			
			properties = new Properties();
			properties.load(fis);
			
			fis.close();
		}catch(Exception e) {
			
			e.printStackTrace();
			
			
		} //end of catch block
		
	} //end of static block
	
	
	
	public static String getProperty(String keyName) {
		return properties.getProperty(keyName);
	}
	
	
	
	
	
	
	
	
	

	
	
} // end of class
