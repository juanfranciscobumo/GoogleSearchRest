package com.tottus.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/com/tottus/www/features/rest_service.feature",
		glue= "com/tottus/www/stepdefinitions",
		snippets=SnippetType.CAMELCASE)
public class RestServiceRunner {

}
