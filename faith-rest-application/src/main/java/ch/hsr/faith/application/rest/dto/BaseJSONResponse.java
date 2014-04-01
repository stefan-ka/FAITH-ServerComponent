package ch.hsr.faith.application.rest.dto;

import java.util.ArrayList;
import java.util.List;

public class BaseJSONResponse {

	public static final String STATUS_SUCCESS = "success";
	public static final String STATUS_FAIL = "fail";
	public static final String STATUS_ERROR = "error";

	private String status;
	private String errorMessage;
	private List<String> failures;
	private Object data;

	public BaseJSONResponse(String status) {
		this.status = status;
		this.failures = new ArrayList<>();
		this.errorMessage = "";
	}

	public void addFailure(String failure) {
		this.failures.add(failure);
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public List<String> getFailures() {
		return failures;
	}

	public void setFailures(List<String> failures) {
		this.failures = failures;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
