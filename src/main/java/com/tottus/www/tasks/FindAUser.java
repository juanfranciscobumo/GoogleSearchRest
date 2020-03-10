package com.tottus.www.tasks;

import static com.tottus.www.utils.Constantes.RECURSO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.tottus.www.models.User;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class FindAUser implements Task {
	private String token;
	private String firstName;
	private String lastName;

	public FindAUser(User user) {
		this.token = user.getToken();
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Get.resource(RECURSO)
				.with(request -> request
				.param("access-token", token)
				.param("first_name", firstName)
				.param("last_name", lastName))				
				);
	}

	public static FindAUser withData(User user) {
		return instrumented(FindAUser.class,user);
	}
}
