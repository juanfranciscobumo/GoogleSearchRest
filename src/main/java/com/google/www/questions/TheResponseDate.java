package com.google.www.questions;

import com.google.www.models.ResponseGoogleSearch;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TheResponseDate implements Question<Boolean> {
	private String title;
	private String searchTerms;

	public TheResponseDate(String title, String searchTerms) {
		this.title = title;
		this.searchTerms = searchTerms;
	}

	@Override
	public Boolean answeredBy(Actor actor) {
		ResponseGoogleSearch reesponse = SerenityRest.lastResponse().jsonPath().getObject("",
				ResponseGoogleSearch.class);

		return reesponse.getQueries().getRequest().stream()
				.anyMatch(res -> res.getSearchTerms().equals(searchTerms) && res.getTitle().equals(title));
	}

	public static TheResponseDate isCorrect(String title, String searchTerms) {
		return new TheResponseDate(title, searchTerms);
	}
}
