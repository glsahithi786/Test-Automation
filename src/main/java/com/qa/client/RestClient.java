package com.qa.client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
		
	//GET method 
	public void get(String url) throws ClientProtocolException, IOException {
	
	CloseableHttpClient httpClient = HttpClients.createDefault(); // createDefault() will create one client connection and will return the Closeable object
	HttpGet httpget = new HttpGet(url); // http get request - method will create one get connection with url
	CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpget); //hit the get url
	
	
	//Validate Status code
	int statuscode = closeableHttpResponse.getStatusLine().getStatusCode();
	System.out.println("Status code is "+statuscode);
	
	
	//Validate response getting JSON string
	String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(),"UTF-8");
	
	JSONObject responseJson = new JSONObject(responseString); //converts String format to JSON by using JSONObject utiltiy
	System.out.println("Response JSON from API  "+responseJson);
	
	//Validate Headers getting all headers
	
	Header[] headersArray = closeableHttpResponse.getAllHeaders();
	
	HashMap<String,String> allHeaders  = new HashMap<String,String>();
	
	for(Header header : headersArray) {
		allHeaders.put(header.getName(),header.getValue());
	}
	System.out.println("headers array "+allHeaders);
	
	}
	
}
