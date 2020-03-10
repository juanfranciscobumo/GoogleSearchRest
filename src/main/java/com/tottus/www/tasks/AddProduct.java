package com.tottus.www.tasks;

import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.BTNADD;
import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.DISPLAYPRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AddProduct implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BTNADD),
				Click.on(DISPLAYPRODUCT)
				);

	}

	public static AddProduct toShoppingCart() {
		return instrumented(AddProduct.class);
	}
}
