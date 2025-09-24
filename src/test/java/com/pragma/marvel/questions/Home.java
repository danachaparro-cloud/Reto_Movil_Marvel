package com.pragma.marvel.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home implements Question<Boolean> {
    private static final Target TITLE = Target.the("Login")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Log In\"]"));

    @Override
    public Boolean answeredBy(Actor actor) {
        return TITLE.resolveFor(actor).isVisible();
    }

    public static Home isVisible() {
        return new Home();
    }
}
