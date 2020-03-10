package com.tottus.www.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/com/tottus/www/features/restService.feature",
		glue= "com/tottus/www/stepdefinitions")
public class RestServiceRunner {

}
