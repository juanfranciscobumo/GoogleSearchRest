package com.tottus.www.runners;

import static cucumber.api.SnippetType.CAMELCASE;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/com/tottus/www/features/make_purchase.feature"
,glue = "com/tottus/www/stepdefinitions"
,snippets = CAMELCASE)
public class MakePurchaseRunner {

}
