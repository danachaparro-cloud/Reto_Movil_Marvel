package com.pragma.marvel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirApp implements Task {

    public static AbrirApp laAplicacion() {
        return instrumented(AbrirApp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Appium abre la app automáticamente con las capacidades de serenity.conf
    }
}


