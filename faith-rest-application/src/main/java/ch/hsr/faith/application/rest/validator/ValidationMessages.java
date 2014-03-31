package ch.hsr.faith.application.rest.validator;

import java.util.ArrayList;
import java.util.List;

public class ValidationMessages {
	private List<FieldValidationError> fieldErrors = new ArrayList<>();

	public List<FieldValidationError> getFieldErrors() {
		return fieldErrors;
	}

	public void addFieldError(String message) {
		FieldValidationError fieldError = new FieldValidationError(message);
		fieldErrors.add(fieldError);
	}
}
