package ch.hsr.faith.service.util;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import ch.hsr.faith.domain.Facility;
import ch.hsr.faith.domain.FacilityWithDistance;

public class Distances extends GoogleAPIRequest {
	private final static String apiName = "distancematrix";
	private double longitude, latitude;

	public Distances(double latitude, double longitude) {
		super(apiName);
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public List<FacilityWithDistance> addDistanceToFaciliies(List<Facility> source) {
		addParameter("origins", this.latitude + "," + longitude);
		addDestinations(source);
		addParameter("sensor", "false");

		execute();

		if (isSucceded()) {
			List<FacilityWithDistance> result = extract(source);
			Collections.sort(result);
			return result;
		} else {
			return fillDistanceWithZero(source);
		}

	}

	private List<FacilityWithDistance> fillDistanceWithZero(List<Facility> source) {
		LinkedList<FacilityWithDistance> result = new LinkedList<>();
		for (Facility f : source) {
			result.add(new FacilityWithDistance(f, 0));
		}
		return result;
	}

	private List<FacilityWithDistance> extract(List<Facility> source) {
		LinkedList<FacilityWithDistance> result = new LinkedList<>();
		for (int i = 0; i < source.size(); i++) {
			Integer distanceInMetres = getResponse().getJSONArray("rows").getJSONObject(0).getJSONArray("elements").getJSONObject(i).getJSONObject("distance").getInt("value");
			Integer distanceInKm = distanceInMetres/1000;
			result.add(new FacilityWithDistance(source.get(i), distanceInKm));
		}
		return result;
	}

	private void addDestinations(List<Facility> source) {
		LinkedList<String> params = new LinkedList<>();
		for (Facility f : source) {
			params.add(getGPSParam(f));
		}
		addParameterList("destinations", params, "|");
	}

	private String getGPSParam(Facility f) {
		return f.getGpsLatitude() + "," + f.getGpsLongitude();
	}
}