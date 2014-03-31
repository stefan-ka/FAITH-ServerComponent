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

import ch.hsr.faith.application.rest.validator.ValidationMessages;
import ch.hsr.faith.exception.FAITHException;

@ControllerAdvice
public class RestGlobalExceptionHandler {

	@Autowired
	private MessageSource messageSource;

	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public ErrorInfo handleUnhandledExceptions(HttpServletRequest request, Exception exception) {
		return new ErrorInfo(request.getRequestURL().toString(), exception.getMessage());
	}

	@ExceptionHandler(FAITHException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ErrorInfo handleFaithException(HttpServletRequest request, FAITHException faithException) {
		return new ErrorInfo(request.getRequestURL().toString(), faithException.getMessage());
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public ValidationMessages handleValidationMessages(MethodArgumentNotValidException exception) {
		ValidationMessages validationMessages = new ValidationMessages();
		BindingResult result = exception.getBindingResult();

		for (FieldError fieldError : result.getFieldErrors()) {
			validationMessages.addFieldError(messageSource.getMessage(fieldError.getCode(), null, LocaleContextHolder.getLocale()));
		}
		for (ObjectError globalError : result.getGlobalErrors()) {
			validationMessages.addFieldError(messageSource.getMessage(globalError.getCode(), null, LocaleContextHolder.getLocale()));
		}
		return validationMessages;
	}

}
