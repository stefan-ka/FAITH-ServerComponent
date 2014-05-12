package ch.hsr.faith.service.util;

import java.util.LinkedList;

import org.apache.log4j.Logger;

import ch.hsr.faith.domain.Facility;

public class CoordinateFetcher extends GoogleAPIRequest {
	private final static String apiName = "geocode";

	public CoordinateFetcher() {
		super(apiName);
	}

	public void addGPStoFacility(Facility facility) {
		LinkedList<String> address = new LinkedList<>();
		address.add(facility.getStreet());
		address.add(facility.getZip());
		address.add(facility.getCity());
		address.add(facility.getCountry());

		addParameterList("address", address, "+");
		addParameter("sensor", "false");

		execute();

		if (isSucceded()) {
			facility.setGpsLatitude(extractLocationLatitude());
			facility.setGpsLongitude(extractLocationLongitude());
		}
	}

	private Float extractLocationLongitude() {
		double longitude = getResponse().getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lng");
		Logger.getRootLogger().debug("Longitude extracted: " + longitude);
		return (float) longitude;
	}

	private Float extractLocationLatitude() {
		double latitude = getResponse().getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lat");
		Logger.getRootLogger().debug("Latitude extracted: " + latitude);
		return (float) latitude;
	}

}