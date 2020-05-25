package com.choucair.reto001.automatizacion.questions;

import com.choucair.reto001.automatizacion.userinterface.WebTablePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Respuesta implements Question<Boolean> {
    private String pregunta;

    public Respuesta(String pregunta) {
        this.pregunta = pregunta;
    }

    public static Respuesta paraLa(String pregunta) {
        return new Respuesta(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String label_registro_exitoso = Text.of(WebTablePage.LABEL_REGISTRO_EXITOSO)
                .viewedBy(actor).asString().replace("-","").trim();
        System.out.println(label_registro_exitoso);

        if(pregunta.equals(label_registro_exitoso)) {
            result=true;
        }else {
            result= false;
        }

        return result;
    }

}