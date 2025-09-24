package com.pragma.marvel.tasks;

import com.pragma.marvel.interaction.OcultarTeclado;
import com.pragma.marvel.interaction.ScrollToTarget;
import com.pragma.marvel.ui.LoginPage;
import com.pragma.marvel.ui.PaginaRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegistrarUsuario implements Task {

    private final String nombre;
    private final String correo;
    private final String contrasena;
    private final String genero; // "F" o "M"

    public RegistrarUsuario(String nombre, String correo, String contrasena, String genero) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.genero = genero;
    }

    public static RegistrarUsuario conDatos(String nombre, String correo, String contrasena, String genero) {
        return instrumented(RegistrarUsuario.class, nombre, correo, contrasena, genero);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                // Completar campos
                Click.on(PaginaRegistro.NAME_FIELD),
                Enter.theValue(nombre).into(PaginaRegistro.NAME_FIELD),
                Click.on(PaginaRegistro.EMAIL_FIELD),
                Enter.theValue(correo).into(PaginaRegistro.EMAIL_FIELD),
                Click.on(PaginaRegistro.PASSWORD_FIELD),
                Enter.theValue(contrasena).into(PaginaRegistro.PASSWORD_FIELD),
                ScrollToTarget.the(PaginaRegistro.CONFIRM_PASSWORD_FIELD),
                Click.on(PaginaRegistro.CONFIRM_PASSWORD_FIELD),
                Enter.theValue(contrasena).into(PaginaRegistro.CONFIRM_PASSWORD_FIELD),
                OcultarTeclado.ahora(),

                // Seleccionar género
                ScrollToTarget.the(PaginaRegistro.GENDER_DROPDOWN),
                Click.on(PaginaRegistro.GENDER_DROPDOWN),
                genero.equalsIgnoreCase("F")
                        ? Click.on(PaginaRegistro.GENDER_FEMALE)
                        : Click.on(PaginaRegistro.GENDER_MALE),

                // Aceptar términos
                Click.on(PaginaRegistro.ACEPTAR_TERMINOS),

                // Confirmar registro
                Click.on(PaginaRegistro.REGISTER_BUTTON)
        );
    }
}



