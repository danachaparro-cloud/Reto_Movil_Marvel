package com.pragma.marvel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.pragma.marvel.ui.HomePage.BARRA_BUSQUEDA;
import static com.pragma.marvel.ui.HomePage.BOTON_BUSCAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarPersonajeBarra implements Task {

    private final String nombrePersonaje;

    public BuscarPersonajeBarra(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public static BuscarPersonajeBarra conNombre(String nombrePersonaje) {
        return instrumented(BuscarPersonajeBarra.class, nombrePersonaje);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_BUSCAR),
                Click.on(BARRA_BUSQUEDA),
                Enter.theValue(nombrePersonaje).into(BARRA_BUSQUEDA)
        );
    }
}
