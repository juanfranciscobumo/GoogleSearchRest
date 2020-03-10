package com.tottus.www.tasks;

import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.BTNAGREGAR;
import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.DESPLEGARPRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddProduct implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BTNAGREGAR),
				Click.on(DESPLEGARPRODUCTOS)
				);

	}

	public static AddProduct toShoppingCart() {
		return instrumented(AddProduct.class);
	}
}
