package com.pragma.marvel.stepdefinition;

import com.pragma.marvel.questions.Home;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import com.pragma.marvel.tasks.CerrarSesion;

public class CerrarSesionStepDefinition {

    @Cuando("el usuario cierra sesion")
    public void elUsuarioCierraSesion() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CerrarSesion.ahora()
        );
    }

    @Entonces("deberia ver la pantalla login")
    public void deberiaVerPantallaPrincipal() {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(Home.isVisible()));
    }
}
