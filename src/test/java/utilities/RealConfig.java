package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class RealConfig {

	
	Properties properties;
	String path="config.properties";
	public  RealConfig() { //Realconfig is a constructor  which will initialise all property file and it  will call getbrowser
	try{ 
		properties=new Properties();
		
		FileInputStream fis=new FileInputStream(path);
		properties.load(fis);
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public String getBrowser() {
		String value=properties.getProperty("browser");
		if (value!=null)
		return value;
		else
			throw new RuntimeException("url not found in config file");
	}
}
