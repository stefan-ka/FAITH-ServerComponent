package ch.hsr.faith.application.rest.exception;

public class ErrorInfo {

	private String errorUrl;
	private String errorMessage;

	public ErrorInfo(String errorUrl, String errorMessage) {
		this.errorUrl = errorUrl;
		this.errorMessage = errorMessage;
	}

	public String getErrorUrl() {
		return errorUrl;
	}

	public void setErrorUrl(String errorUrl) {
		this.errorUrl = errorUrl;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
