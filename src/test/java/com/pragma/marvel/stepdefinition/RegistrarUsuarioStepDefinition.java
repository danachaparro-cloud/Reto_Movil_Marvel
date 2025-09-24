package com.pragma.marvel.stepdefinition;

import com.pragma.marvel.questions.HomePageTitle;
import com.pragma.marvel.questions.UsuarioRegistrado;
import com.pragma.marvel.tasks.RegistrarUsuario;
import com.pragma.marvel.ui.PaginaRegistro;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioStepDefinition {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Dana")
                .can(BrowseTheWeb.with(net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver()));
    }

    @Dado("que el usuario abre la aplicacion y selecciona registrarse")
    public void usuarioAbreAppYSeleccionaRegistrarse() {
        theActorInTheSpotlight().attemptsTo(
                net.serenitybdd.screenplay.actions.Click.on(PaginaRegistro.SIGNUP_BUTTON)
        );
    }

    @Cuando("completa el formulario de registro con datos validos")
    public void completaElFormularioDeRegistroConDatosValidos() {
        theActorInTheSpotlight().attemptsTo(
                RegistrarUsuario.conDatos("Test", "usuario@test.com", "123456", "F")
        );
    }

    @Entonces("deberia ver el mensaje de confirmacion de registro")
    public void deberiaVerMensajeConfirmacion() {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(UsuarioRegistrado.isVisible()));
    }
}






