package com.choucair.reto001.automatizacion.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/AutomationDemo.feature",
        tags= "@Reto_01",
        glue="com.choucair.reto001.automatizacion.stepdefinitions",
        snippets=SnippetType.CAMELCASE)

public class RunnerTags {

}