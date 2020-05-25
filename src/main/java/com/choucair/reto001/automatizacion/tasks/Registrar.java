package com.choucair.reto001.automatizacion.tasks;

import com.choucair.reto001.automatizacion.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;
import java.util.List;
import java.util.Map;

import static com.choucair.reto001.automatizacion.util.TablaRegistros.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.valueOf;

public class Registrar implements Task {
    private List<Map<String,String>> data;

    public Registrar(List<Map<String,String>> data){
        this.data = data;
    }

    public static Registrar datosPersonales(List<Map<String,String>> data) {
        return Tasks.instrumented(Registrar.class,data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(data.get(0).get(NOMBRES)).into(RegisterPage.INGRESAR_NOMBRES),
                Enter.theValue(data.get(0).get(APELLIDOS)).into(RegisterPage.INGRESAR_APELLIDOS),
                Enter.theValue(data.get(0).get(DIRECCION)).into(RegisterPage.INGRESAR_DIRECCION),
                Enter.theValue(data.get(0).get(CORREO)).into(RegisterPage.INGRESAR_CORREO),
                Enter.theValue(data.get(0).get(TELEFONO)).into(RegisterPage.INGRESAR_TELEFONO),
                Click.on(RegisterPage.SELECCIONAR_SEXO),
                Click.on(RegisterPage.SELECCIONAR_HOBBIES),
                Click.on(RegisterPage.DESPLEGAR_IDIOMAS),
                Check.whether(
                        valueOf(RegisterPage.OPCIONES_IDIOMAS),isCurrentlyEnabled())
                        .andIfSo(Click.on(RegisterPage.SELECCIONAR_ESPANOL)),
                SelectFromOptions.byVisibleText(data.get(0).get(HABILIDADES)).from(RegisterPage.SELECCIONAR_HABILIDADES),
                SelectFromOptions.byVisibleText(data.get(0).get(PAIS)).from(RegisterPage.SELECCIONAR_PAIS),
                SelectFromOptions.byVisibleText(data.get(0).get(CIUDAD)).from(RegisterPage.SELECCIONAR_CIUDAD),
                SelectFromOptions.byVisibleText(data.get(0).get(ANO)).from(RegisterPage.SELECCIONAR_ANO),
                SelectFromOptions.byVisibleText(data.get(0).get(MES)).from(RegisterPage.SELECCIONAR_MES),
                SelectFromOptions.byVisibleText(data.get(0).get(DIA)).from(RegisterPage.SELECCIONAR_DIA),
                Enter.theValue(data.get(0).get(CONTRASENA)).into(RegisterPage.INGRESAR_CONTRASENA),
                Enter.theValue(data.get(0).get(CONTRASENA)).into(RegisterPage.CONFIRMAR_CONTRASENA),
                Click.on(RegisterPage.BOTON_ENVIAR)

                );
    }

}