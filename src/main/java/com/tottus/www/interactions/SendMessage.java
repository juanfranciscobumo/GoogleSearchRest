package com.tottus.www.interactions;

import static com.tottus.www.utils.Constantes.RECURSO;

import com.tottus.www.models.User;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class SendMessage implements Interaction {
	private String token;
	private String firstName;
	private String lastName;

	public SendMessage(User user) {
		this.token = user.getToken();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Get.resource(RECURSO).with(request -> request.param("access-token", token)
				.param("first_name", firstName).param("last_name", lastName)));

	}

	public static SendMessage get(User user) {
		return Tasks.instrumented(SendMessage.class, user);
	}
}
