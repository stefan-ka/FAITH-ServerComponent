package ch.hsr.faith.service.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import ch.hsr.faith.domain.Facility;

public class Coordinates {
	private static String apiurl = "https://maps.googleapis.com/maps/api/geocode/";
	private static String outputFormat = "json";
	private static String encoding = "UTF-8";

	public static void fetchGPSCoordinates(Facility facility) { 
		String address = getLocationString(facility);
		URL apiURL = getApiUrl(address);
		
		JSONObject location;
		
		try {
			location = getJSONResponse(apiURL);
		} catch (IOException e) {
			Logger.getRootLogger().error("Unable to talk Google API");
			return;
		}
		facility.setGpsLatitude(extractLocationLatitude(location));
		facility.setGpsLongitude(extractLocationLongitude(location));
	}
	
	private static Float extractLocationLongitude(JSONObject location) {
		double longitude = location.getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lng");
		Logger.getRootLogger().debug("Longitude: " + longitude);
		return (float)longitude;
	}
	private static Float extractLocationLatitude(JSONObject location) {
		double latitude = location.getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lat");
		Logger.getRootLogger().debug("Latitude: " + latitude);
		return (float)latitude;
	}

	private static String getLocationString(Facility facility) {
		String result;
		try {
		result = URLEncoder.encode(facility.getStreet(), encoding);
		result += "+" + URLEncoder.encode(facility.getCity(), encoding);
		result += "+" + URLEncoder.encode(facility.getCountry(), encoding);
		} catch (UnsupportedEncodingException e) {
			Logger.getRootLogger().error("Selected Encoding is wrong");
			throw new RuntimeException("Selected Encoding is wrong");
		}
		return result;
	}

	private static JSONObject getJSONResponse(URL apiURL) throws IOException {
		URLConnection connection = apiURL.openConnection();

		String line;
		StringBuilder builder = new StringBuilder();
		BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		while ((line = reader.readLine()) != null) {
			builder.append(line);
		}

		return new JSONObject(builder.toString());
	}

	private static URL getApiUrl(String address) {
		String params = "address=" + address + "&";
		params += "sensor=false";
		URL url;

		try {
			url = new URL(apiurl + outputFormat + "?" + params);
			Logger.getRootLogger().debug("Calling URL: " + url);
			return url;
		} catch (Exception e) {
			Logger logger = Logger.getRootLogger();
			logger.error("Invalid locations for distance calculation");
			return null;
		}

	}
}
