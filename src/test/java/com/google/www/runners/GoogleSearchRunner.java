package com.google.www.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/com/google/www/features/googleSearch.feature"
        , glue = "com/google/www/stepdefinitions"
        , snippets = CAMELCASE)
public class GoogleSearchRunner {

}
