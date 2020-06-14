package com.google.www.stepdefinitions;

import static com.google.www.exceptions.ServicioRestException.DATA;
import static com.google.www.exceptions.ServicioRestException.RESPONSE_CODE;
import static com.google.www.utils.Constantes.ENDPOINT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import com.google.www.exceptions.ServicioRestException;
import com.google.www.models.Data;
import com.google.www.questions.TheResponseDate;
import com.google.www.tasks.RealiceSearch;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GoogleSearchStepDefinition {

	@Before
	public void set_the_stage() {
		OnStage.setTheStage(new OnlineCast());

	}

	@Given("^the user enter the endpoint of the rest service$")
	public void theUserEnterTheEndpointOfTheRestService() {
		theActorCalled("juan").whoCan(CallAnApi.at(ENDPOINT));
	}

	@When("^he user enter the dates$")
	public void heUserEnterTheDates(List<Data> data) {
		theActorInTheSpotlight().attemptsTo(RealiceSearch.inGoogle(data.get(0)));
	}

	@Then("^he user verify the response message and code (\\d+)$")
	public void heUserVerifyTheResponseMessageAndCode(int code) {
		theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(code))
				.orComplainWith(ServicioRestException.class, RESPONSE_CODE));
SerenityRest.lastResponse().print();
	}

	@Then("^you should see the result of the search the title (.*) and (.*)$")
	public void youShouldSeeTheResultOfTheSearchTheTitleGoogleCustomSearchFacebookAndFacebook(String title,
			String searchTerms) {
		theActorInTheSpotlight().should(seeThat(TheResponseDate.isCorrect(title, searchTerms), equalTo(true))
				.orComplainWith(ServicioRestException.class, DATA));
		
	}

}
