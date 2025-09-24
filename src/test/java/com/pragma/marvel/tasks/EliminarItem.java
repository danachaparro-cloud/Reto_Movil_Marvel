package com.pragma.marvel.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import com.pragma.marvel.ui.ListaPage;

public class EliminarItem implements Task {

    private final String personaje;

    public EliminarItem(String personaje) {
        this.personaje = personaje;
    }

    public static EliminarItem deLista(String personaje) {
        return Tasks.instrumented(EliminarItem.class, personaje);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ListaPage.deleteButtonFor(personaje))
        );
    }
}

