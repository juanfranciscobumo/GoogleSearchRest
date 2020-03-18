package com.tottus.www.tasks;

import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.BTNPRODUCT;
import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.OPTTECNOLOGY;
import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.POPUPWINDOW;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tottus.www.userinterfaces.MakePurchaseUserInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SelectProduct implements Task {
	private String product;

	public SelectProduct(String product) {
		this.product = product;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(POPUPWINDOW),
				Click.on(MakePurchaseUserInterface.COVID19),
				Click.on(OPTTECNOLOGY),
				Scroll.to(BTNPRODUCT.of(product)),
				Click.on(BTNPRODUCT.of(product)));
        
	}

	public static SelectProduct inTheStore(String product) {
		return instrumented(SelectProduct.class, product);
	}
}
