package com.tottus.www.questions;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

import net.serenitybdd.screenplay.Question;

public class TheResponseDate {

	public static Question<String> firstName() {
		return actor -> lastResponse().jsonPath().get("result.first_name").toString();
	}

	public static Question<String> lastName() {
		return actor -> lastResponse().jsonPath().get("result.last_name").toString();
	}

	public static Question<String> code() {
		return actor -> lastResponse().jsonPath().get("_meta.code").toString();
	}

	public static Question<String> statusCode() {
		return actor -> String.valueOf(lastResponse().getStatusCode());
	}
}
