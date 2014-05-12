package ch.hsr.faith.service.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;

import org.apache.log4j.Logger;
import org.json.JSONObject;

public class GoogleAPIRequest {
	private static final String apiHost = "https://maps.googleapis.com/maps/api";
	private static final String outputFormat = "json";
	private static final String URLEncoding = "UTF-8";

	private String apiName;
	private String parameter = "";
	private JSONObject response;


	private boolean failed = false;

	Logger log = Logger.getRootLogger();

	public GoogleAPIRequest(String apiName) {
		this.apiName = apiName;
	}

	protected String getRequestString() {
		return apiHost+ "/" + apiName + "/" + outputFormat + "?" + parameter;
	}

	private URL getRequestURL() throws MalformedURLException {
		return new URL(getRequestString());
	}

	protected void execute() {
		URL url;

		try {
			url = getRequestURL();
		} catch (MalformedURLException e) {
			log.error("Unable to create URL for: " + getRequestString());
			failed = true;
			return;
		}
		
		StringBuilder responseBuilder;
		try {
			URLConnection connection = url.openConnection();

			String responseLine;
			responseBuilder = new StringBuilder();
			BufferedReader responseReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			while ((responseLine = responseReader.readLine()) != null) {
				responseBuilder.append(responseLine);
			}
		} catch (IOException e) {
			log.error("Unable to connect to Google API");
			failed = true;
			return;
		}
		try { 
			response = new JSONObject(responseBuilder.toString());
			
		} catch (Exception e) { 
			System.out.println("fuck");
		}
		log.debug("Google API call: " + getRequestString());

	}

	protected void addParameter(String key, String value) {
		if(!parameter.isEmpty()) { 
			parameter += "&";
		}
		try {
			parameter += key + "=";
			parameter += URLEncoder.encode(value, URLEncoding);
		} catch (UnsupportedEncodingException e) {
			log.error("Encoding not supported");
		}

	}
	
	protected void addParameterList(String key, List<String> paramList) { 
		
		if(!parameter.isEmpty()) { 
			parameter += "&";
		}
		try {
			parameter += key + "=";
			for(String param : paramList) { 
				parameter += URLEncoder.encode(param, URLEncoding);;
				parameter += "+";
			}
			parameter = parameter.substring(0, parameter.length()-2);
			
		} catch (UnsupportedEncodingException e) {
			log.error("Encoding not supported");
		}

	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	private String getStatus() {
		return response.getString("status");
	}

	protected boolean isSucceded() {
		return getStatus().equals("OK") && !failed;
	}
	
	public JSONObject getResponse() {
		return response;
	}
	
	protected void cleanRequest() { 
		parameter = "";
		response = null;
		
	}
}
