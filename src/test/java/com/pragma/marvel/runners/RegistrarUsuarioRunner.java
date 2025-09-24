package com.pragma.marvel.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registrar_usuario.feature",
        glue = "com.pragma.marvel.stepdefinition",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RegistrarUsuarioRunner {
}

