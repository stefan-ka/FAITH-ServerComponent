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
import org.json.JSONException;

import ch.hsr.faith.domain.Facility;

public class Distances {
	private static String apiurl = "https://maps.googleapis.com/maps/api/distancematrix/";
	private static String outputFormat = "json";
	private static String encoding = "UTF-8";

	public static Integer getDistanceInKm(double originLatitude, double originLongitude, Facility destinationFacility) {
		String destination = getLocationString(destinationFacility);
		String origin = getLocationString(originLatitude, originLongitude);
		URL apiURL = getApiUrl(origin, destination);
		JSONObject distance;
		int distanceInMetres;
		try {
			distance = getJSONResponse(apiURL);
			distanceInMetres = extractDistanceInMetres(distance);
		} catch (IOException | JSONException e) {
			Logger.getRootLogger().error("unable to fetch distance for a single facility");
			return 0;
		}
		return distanceInMetres/1000;
	}

	private static String getLocationString(Double originLatitude, Double originLongitude) {
		return originLatitude.toString() + "," + originLongitude;
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

	private static Integer extractDistanceInMetres(JSONObject distance) {
		int dist= distance.getJSONArray("rows").getJSONObject(0).getJSONArray("elements").getJSONObject(0).getJSONObject("distance").getInt("value");
		Logger.getRootLogger().debug(dist);
		return dist;
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

	private static URL getApiUrl(String origin, String destination) {
		String params = "origins=" + origin + "&";
		params += "destinations=" + destination + "&";
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
