package com.google.www.stepdefinitions;

import static com.google.www.exceptions.ServicioRestException.DATA;
import static com.google.www.exceptions.ServicioRestException.RESPONSE_CODE;
import static com.google.www.utils.Constantes.ENDPOINT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import static org.hamcrest.Matchers.equalTo;

import java.util.Map;

import com.google.www.exceptions.ServicioRestException;
import com.google.www.models.Data;
import com.google.www.questions.TheResponseDate;
import com.google.www.tasks.RealiceSearch;

import io.cucumber.java.DataTableType;
import io.cucumber.java8.En;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class GoogleSearchStepDefinition implements En {
    @DataTableType
    public Data lista(Map<String, String> entry) {
        Data datos= new Data();
        datos.setCx(entry.get("cx"));
        datos.setKey(entry.get("key"));
        datos.setQ(entry.get("q"));
        return datos;
    }
    public GoogleSearchStepDefinition() {

        Before(() -> OnStage.setTheStage(new OnlineCast()));

        Given("{string} enter the endpoint of the rest service", (String actor) ->
                theActorCalled(actor).whoCan(CallAnApi.at(ENDPOINT)));

        When("enter the dates", (Data data) ->
                theActorInTheSpotlight().attemptsTo(RealiceSearch.inGoogle(data)));

        Then("he user will verify the response message and code {int}", (Integer code) ->
                theActorInTheSpotlight().should(seeThatResponse(response -> response.statusCode(code))
                        .orComplainWith(ServicioRestException.class, RESPONSE_CODE)));

        Then("should see the result of the search the title {string} and {string}", (String title, String searchTerms) ->
                theActorInTheSpotlight().should(seeThat(TheResponseDate.isCorrect(title, searchTerms), equalTo(true))
                        .orComplainWith(ServicioRestException.class, DATA)));
    }
}
