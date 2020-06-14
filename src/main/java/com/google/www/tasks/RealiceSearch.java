package com.google.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.google.www.interactions.Search;
import com.google.www.models.Data;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class RealiceSearch implements Task {
	private String key;
	private String cx;
	private String q;

	public RealiceSearch(Data data) {

		this.key = data.getKey();
		this.cx = data.getCx();
		this.q = data.getQ();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Search.withData(key, cx, q));
	}

	public static RealiceSearch inGoogle(Data data) {
		return instrumented(RealiceSearch.class, data);
	}
}
