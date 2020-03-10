package com.tottus.www.tasks;

import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.BTNPRODUCTO;
import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.OPTTECNOLOGIA;
import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.VENTANAEMERGENTE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

public class SelectProduct implements Task {
	private String producto;

	public SelectProduct(String producto) {
		this.producto = producto;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(VENTANAEMERGENTE),
				Click.on(OPTTECNOLOGIA),
				Scroll.to(BTNPRODUCTO.of(producto)),
				Click.on(BTNPRODUCTO.of(producto)));
        
	}

	public static SelectProduct inTheStore(String producto) {
		return instrumented(SelectProduct.class, producto);
	}
}
