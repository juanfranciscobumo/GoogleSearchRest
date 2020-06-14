package com.google.www.interactions;

import static com.google.www.utils.Constantes.RECURSO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class Search implements Interaction {
	private String key;
	private String cx;
	private String q;

	public Search(String key, String cx, String q) {
		this.key = key;
		this.cx = cx;
		this.q = q;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Get.resource(RECURSO).with(request -> request.param("key", key).param("cx", cx).param("q", q)));

	}

	public static Search withData(String key, String cx, String q) {
		return Tasks.instrumented(Search.class, key, cx, q);
	}
}
