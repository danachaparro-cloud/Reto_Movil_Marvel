package com.pragma.marvel.tasks;

import com.pragma.marvel.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HacerLogin implements Task {

    private final String username;
    private final String password;

    public HacerLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static HacerLogin conCredenciales(String username, String password) {
        return Tasks.instrumented(HacerLogin.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(LoginPage.USERNAME_FIELD, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(LoginPage.USERNAME_FIELD),
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Click.on(LoginPage.PASSWORD_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
