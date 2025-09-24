package com.pragma.marvel.stepdefinition;

import com.pragma.marvel.questions.HomePageTitle;
import com.pragma.marvel.tasks.HacerLogin;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class LoginGStepDefinition {

    @Dado("que el usuario ha iniciado sesion con usuario {string} y contrasena {string}")
    public void usuarioHaIniciadoSesion(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HacerLogin.conCredenciales(username, password)
        );
    }
    @Entonces("deberia ver la pantalla principal")
    public void deberiaVerPantallaPrincipal() {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(HomePageTitle.isVisible()));
    }
}

