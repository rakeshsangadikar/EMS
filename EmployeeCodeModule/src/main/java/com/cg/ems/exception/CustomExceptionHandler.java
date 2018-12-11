package com.cg.ems.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(ECMException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public ECMException handleAllExceptions(ECMException ex) {
		return new ECMException(ex.getMessage());
	}

	@ExceptionHandler(NoSuchElementException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public NoSuchElementException handleUserNotFoundException(NoSuchElementException noElement) {
		return new NoSuchElementException(noElement.getMessage());
	}

}
