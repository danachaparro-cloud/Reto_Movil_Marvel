package com.pragma.marvel.tasks;

import com.pragma.marvel.ui.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CerrarSesion implements Task {

    public static CerrarSesion ahora() {
        return Tasks.instrumented(CerrarSesion.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.PERFIL),
                Click.on(HomePage.CERRAR_SESION),
                Click.on(HomePage.ACEPTAR_CERRAR)
        );
    }
}


