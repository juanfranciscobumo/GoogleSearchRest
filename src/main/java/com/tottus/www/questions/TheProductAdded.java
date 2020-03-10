package com.tottus.www.questions;

import static com.tottus.www.userinterfaces.MakePurchaseUserInterface.SEEPRODUCT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TheProductAdded implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(WaitUntil.the(SEEPRODUCT, isVisible()));
		return Text.of(SEEPRODUCT).viewedBy(actor).asString();
	}

	public static TheProductAdded is() {
		return new TheProductAdded();
	}
}
