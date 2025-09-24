package com.pragma.marvel.stepdefinition;

import com.pragma.marvel.questions.PersonajeEsVisible;
import com.pragma.marvel.tasks.BuscarPersonajesListas;
import com.pragma.marvel.ui.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;


public class BuscarPersonajesListaStepDefinition {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Cuando("el usuario busca el personaje {string}")
    public void elUsuarioBuscaElPersonaje(String nombrePersonaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                BuscarPersonajesListas.conNombre(nombrePersonaje)
        );
    }

    @Entonces("el usuario ve los personajes buscados")
    public void elUsuarioVeLosPersonajesBuscados() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(PersonajeEsVisible.enPantalla(
                        HomePage.PERSONAJE_RESULTADO),is(true))
                );
    }

    @Entonces("el usuario ve que el personaje no existe")
    public void elUsuarioVeQueElPersonajeNoExiste() {
        OnStage.theActorInTheSpotlight()
                .should(seeThat(PersonajeEsVisible.enPantalla(
                        HomePage.NO_EXISTE),is(true))
                );
    }

}
