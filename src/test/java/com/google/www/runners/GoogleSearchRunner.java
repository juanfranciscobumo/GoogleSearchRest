package com.google.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/com/google/www/features/googleSearch.feature",
		glue= "com/google/www/stepdefinitions",
		snippets=SnippetType.CAMELCASE)
public class GoogleSearchRunner {

}
