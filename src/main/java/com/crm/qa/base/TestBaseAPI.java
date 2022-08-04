package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBaseAPI {
	
	public Properties prop;
	
	
	public TestBaseAPI() {
		
		try {
			
			prop = new Properties();
			FileInputStream ip = new FileInputStream(("C:\\Users\\lganti\\eclipse-workspace\\FreeCRM\\src\\main\\java\\com\\crm\\qa\\config\\config.properties"));
			prop.load(ip);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
