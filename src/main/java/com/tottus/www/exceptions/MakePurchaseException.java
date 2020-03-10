package com.tottus.www.exceptions;

@SuppressWarnings("serial")
public class MakePurchaseException extends AssertionError {
	public static final String THE_PRODUCT_WAS_NOT_FOUND = "THE SEARCHED PRODUCT WAS NOT FOUND";

	public MakePurchaseException(String message, Throwable cause) {
		super(message, cause);

	}
}