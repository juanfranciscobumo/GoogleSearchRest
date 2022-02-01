package com.google.www.tasks;

import static com.google.www.utils.Constantes.RECURSO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.google.www.models.Data;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class RealiceSearch implements Task {
	private Data data;

	public RealiceSearch(Data data) {
		this.data = data;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(RECURSO)
				.with(request -> request
						.param("key", data.getKey())
						.param("cx", data.getCx())
						.param("q", data.getQ())));

	}

	public static RealiceSearch inGoogle(Data data) {
		return instrumented(RealiceSearch.class, data);
	}
}
