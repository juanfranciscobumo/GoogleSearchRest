package com.tottus.www.questions;

import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.VERPRODUCTO;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheProductAdded implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(VERPRODUCTO).viewedBy(actor).asString();
	}

	public static TheProductAdded is() {
		return new TheProductAdded();
	}
}
