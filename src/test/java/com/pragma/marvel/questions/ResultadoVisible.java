package com.pragma.marvel.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ResultadoVisible implements Question<Boolean> {

    private static final Target NOMBRE_PERSONAJE = Target.the("Nombre del Personaje")
            .located(By.xpath("//android.view.View[@content-desc=\"Basic Information\n" +
                    "Description:\n" +
                    "Sharon Carter\n" +
                    "Alignment:\n" +
                    "good\"]"));

    @Override
    public Boolean answeredBy(Actor actor) {
        return NOMBRE_PERSONAJE.resolveFor(actor).isVisible();
    }

    public static ResultadoVisible isVisible() {
        return new ResultadoVisible();
    }

}


