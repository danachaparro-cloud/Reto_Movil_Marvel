package com.pragma.marvel.tests;

import com.pragma.marvel.tasks.HacerLogin;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static net.serenitybdd.screenplay.GivenWhenThen.when;

@RunWith(SerenityRunner.class)
public class LoginTest {

    private Actor dana = Actor.named("Dana");

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        dana.can(BrowseTheWeb.with(net.serenitybdd.core.Serenity.getDriver()));
    }

    @Test
    public void loginExitoso() {
        when(dana).attemptsTo(
                HacerLogin.conCredenciales("miUsuario", "miPassword")
        );
    }
}
