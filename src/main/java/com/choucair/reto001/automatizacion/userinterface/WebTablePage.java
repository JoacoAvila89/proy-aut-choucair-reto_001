package com.choucair.reto001.automatizacion.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class WebTablePage {

    private WebTablePage(){}

    public static final Target LABEL_REGISTRO_EXITOSO = Target.the("Campo para ingresar Nombre")
            .locatedBy("//h4[contains(text(), ' - Double Click on Edit Icon to ')]");
}
