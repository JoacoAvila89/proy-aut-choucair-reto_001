package com.choucair.reto001.automatizacion.tasks;

import com.choucair.reto001.automatizacion.userinterface.AutomationDemoSitePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private AutomationDemoSitePage automationDemoSitePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(automationDemoSitePage));
    }

    public static Abrir laPagina() {
        return Tasks.instrumented(Abrir.class);
    }

}
