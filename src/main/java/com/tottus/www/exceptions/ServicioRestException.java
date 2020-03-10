package com.tottus.www.exceptions;


@SuppressWarnings("serial")
public class ServicioRestException extends AssertionError {
	public static final String MESSAGE_FAILED_THE_RESPONSE_SERVICE_REST = "NOT FOUND EXPECTED ANSWER";

	public ServicioRestException(String message, Throwable cause) {
		super(message, cause);

	}
}
