package com.pragma.marvel.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageTitle implements Question<Boolean> {
    private static final Target TITLE = Target.the("título de la pantalla Home")
            .located(By.xpath("//android.widget.ImageView"));

    @Override
    public Boolean answeredBy(Actor actor) {
        return TITLE.resolveFor(actor).isVisible();
    }

    public static HomePageTitle isVisible() {
        return new HomePageTitle();
    }
}

