package ch.hsr.faith.application.rest.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import ch.hsr.faith.application.rest.dto.BaseJSONResponse;
import ch.hsr.faith.exception.FAITHException;

@ControllerAdvice
public class RestGlobalExceptionHandler {

	@Autowired
	private MessageSource messageSource;

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public BaseJSONResponse handleUnhandledExceptions(HttpServletRequest request, Exception exception) {
		BaseJSONResponse response = new BaseJSONResponse(BaseJSONResponse.STATUS_ERROR);
		response.setErrorMessage(exception.getMessage());
		return response;
	}

	@ExceptionHandler(FAITHException.class)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public BaseJSONResponse handleFaithException(HttpServletRequest request, FAITHException faithException) {
		BaseJSONResponse response = new BaseJSONResponse(BaseJSONResponse.STATUS_FAIL);
		response.addFailure(faithException.getMessage());
		return response;
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public BaseJSONResponse handleValidationMessages(MethodArgumentNotValidException exception) {
		BaseJSONResponse response = new BaseJSONResponse(BaseJSONResponse.STATUS_FAIL);
		BindingResult result = exception.getBindingResult();

		for (FieldError fieldError : result.getFieldErrors()) {
			response.addFailure(messageSource.getMessage(fieldError.getCode(), null, LocaleContextHolder.getLocale()));
		}
		for (ObjectError globalError : result.getGlobalErrors()) {
			response.addFailure(messageSource.getMessage(globalError.getCode(), null, LocaleContextHolder.getLocale()));
		}
		return response;
	}

}
