package com.pragma.marvel.tasks;

import com.pragma.marvel.interaction.ScrollToPersonaje;
import com.pragma.marvel.ui.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarPersonaje implements Task {

    public BuscarPersonaje() { }

    public static BuscarPersonaje enElMenu() {
        return Tasks.instrumented(BuscarPersonaje.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                // hace swipes hasta que el target sea detectado (ScrollToPersonaje implementa la lógica)
                ScrollToPersonaje.using(MenuPage.PERSONAJE_OBJETIVO),

                // espera explícita a que esté visible
                WaitUntil.the(MenuPage.PERSONAJE_OBJETIVO, isVisible()).forNoMoreThan(10).seconds(),

                // y hace clic
                Click.on(MenuPage.PERSONAJE_OBJETIVO)
        );
    }
}







