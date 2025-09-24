package com.pragma.marvel.stepdefinition;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import com.pragma.marvel.tasks.BuscarPersonaje;
import com.pragma.marvel.questions.ResultadoVisible;

public class BusquedaPersonajeStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("busca el personaje")
    public void buscaElPersonaje() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarPersonaje.enElMenu()
        );
    }

    @Entonces("deberia ver el personaje buscado")
    public void deberiaVerPersonajeBuscado() {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(ResultadoVisible.isVisible()));
    }

}