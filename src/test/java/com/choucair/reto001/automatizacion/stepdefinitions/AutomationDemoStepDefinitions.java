package com.choucair.reto001.automatizacion.stepdefinitions;

import com.choucair.reto001.automatizacion.questions.Respuesta;
import com.choucair.reto001.automatizacion.tasks.Abrir;
import com.choucair.reto001.automatizacion.tasks.Registrar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AutomationDemoStepDefinitions {

    @Managed(driver="chrome")
    private WebDriver hisBrowser;
    private Actor joseJoaquin = Actor.named("JoseJoaquin");

    @Before
    public void configuracionInicial() {
        joseJoaquin.can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que Joaquin quiere acceder a la Web Automation Demo Site$")
    public void queJoaquinQuiereAccederALaWebAutomationDemoSite()  {
        joseJoaquin.wasAbleTo(Abrir.laPagina());
    }

    @Cuando("^el realiza el registro en la página$")
    public void elRealizaElRegistroEnLaPagina(List<Map<String,String>> data) {
        joseJoaquin.wasAbleTo(Registrar.datosPersonales(data));
    }

    @Entonces("^el verifica que se carga la pantalla con texto (.*)$")
    public void elVerificaQueSeCargaLaPantallaConTextoDoubleClickOnEditIconTo(String pregunta)   {
        joseJoaquin.should(seeThat(Respuesta.paraLa(pregunta)));
    }

}
