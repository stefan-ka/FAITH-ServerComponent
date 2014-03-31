package ch.hsr.faith.application.rest.validator;

public class FieldValidationError {

	private String message;

	public FieldValidationError(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
