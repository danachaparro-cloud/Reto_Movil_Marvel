package com.pragma.marvel.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioRegistrado implements Question<Boolean> {

    // Mensaje de confirmación (ajusta según tu app)
    public static final Target CONFIRMATION_MESSAGE = Target.the("mensaje de confirmacion")
            .located(By.xpath("//android.view.View[@content-desc=\"Successful registration\"]"));

    @Override
    public Boolean answeredBy(Actor actor) {
        return CONFIRMATION_MESSAGE.resolveFor(actor).isVisible();
    }

    public static UsuarioRegistrado isVisible() {
        return new UsuarioRegistrado();
    }
}