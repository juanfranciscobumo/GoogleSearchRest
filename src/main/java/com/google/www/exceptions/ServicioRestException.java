package com.google.www.exceptions;


@SuppressWarnings("serial")
public class ServicioRestException extends AssertionError {
	public static final String RESPONSE_CODE = "RESPONSE CODE INCORRECT";
	public static final String DATA = "THE EXPECTED ANSWER IS CORRECT";
	public ServicioRestException(String message, Throwable cause) {
		super(message, cause);

	}
}
