package com.tottus.www.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tottus.www.interactions.SendMessage;
import com.tottus.www.models.User;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class FindAUser implements Task {
	private User user;

	public FindAUser(User user) {
		this.user = user;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(SendMessage.get(user)		
				);
	}

	public static FindAUser withData(User user) {
		return instrumented(FindAUser.class,user);
	}
}
