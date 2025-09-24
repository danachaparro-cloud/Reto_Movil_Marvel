package com.pragma.marvel.stepdefinition;

import com.pragma.marvel.questions.HomePageTitle;
import com.pragma.marvel.tasks.AbrirApp;
import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import com.pragma.marvel.tasks.HacerLogin;

/*
public class LoginStepDefinition {

    private Actor dana;

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        dana = OnStage.theActorCalled("Dana");
    }

    @Dado("que el usuario esta en la pantalla de login")
    public void usuarioEnPantallaLogin() {
        OnStage.theActorCalled("Dana")
                .wasAbleTo(AbrirApp.laAplicacion());
    }

    @Cuando("ingresa sus credenciales {string} y {string}")
    public void ingresaCredenciales(String usuario, String password) {
        OnStage.theActorInTheSpotlight()
                .attemptsTo(HacerLogin.conCredenciales("danachaparro02@gmail.com","clavePruebas"));
    }

    @Entonces("deberia ver la pantalla principal")
    public void deberiaVerPantallaPrincipal() {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(HomePageTitle.isVisible()));
    }
}

*/