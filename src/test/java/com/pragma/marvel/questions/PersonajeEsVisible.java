package com.pragma.marvel.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class PersonajeEsVisible implements Question<Boolean> {

    private final Target elemento;

    private PersonajeEsVisible(Target elemento) {
        this.elemento = elemento;
    }

    public static PersonajeEsVisible enPantalla(Target elemento) {
        return new PersonajeEsVisible(elemento);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        // Devuelve el WebElement ya encontrado por Appium/Selenium
        return elemento.resolveFor(actor).isVisible();
    }
}



