package com.oliveiralia.project1.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.oliveiralia.project1.services.exceptions.DatabaseException;
import com.oliveiralia.project1.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFoundException(ResourceNotFoundException e, HttpServletRequest request){
		String error = "Resource not found.";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
	 @ExceptionHandler(DatabaseException.class)
	 public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {
		 String error = "Database error";
		 HttpStatus status = HttpStatus.BAD_REQUEST;
		 StandardError err = new StandardError(Instant.now(), status.value(),error, e.getMessage(), request.getRequestURI());
		 return ResponseEntity.status(status).body(err);
	 }

}
