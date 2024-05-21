package com.olympus.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // Specifies that this exception should result in a 404 Not Found response status
public class ResourceNotFoundException extends RuntimeException { // Defines a custom exception that extends RuntimeException

	private static final long serialVersionUID = -3510175088574375864L; // Unique identifier for the Serializable class

	// Default constructor
	public ResourceNotFoundException() {
	    super();
	}
	// Constructor with a message parameter
	public ResourceNotFoundException(String message) {
	    super(message);
	}

	// Constructor with message and cause parameters
	public ResourceNotFoundException(String message, Throwable cause) {
	    super(message, cause);
	}
	

}

