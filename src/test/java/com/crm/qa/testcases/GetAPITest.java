package com.crm.qa.testcases;

import org.testng.annotations.Test;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBaseAPI;
import com.qa.client.RestClient;

public class GetAPITest extends TestBaseAPI {
	
	TestBaseAPI testBaseAPI;
	String serviceUrl;
	String Uri;
	String apiUrl;
	RestClient restClient;
	

	@BeforeMethod
	public void setUp() {
		testBaseAPI = new TestBaseAPI();
		apiUrl = prop.getProperty("APIURL");
		serviceUrl = prop.getProperty("APISERVICEURL");
		
		Uri = apiUrl + serviceUrl ;
		
	}
	
	@Test
	public void getAPITest() throws ClientProtocolException, IOException {
		restClient = new RestClient();
		restClient.get(Uri);
		 
	}
		
	
}
