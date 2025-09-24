package com.pragma.marvel.interaction;

import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import io.appium.java_client.AppiumDriver;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import net.thucydides.core.webdriver.WebDriverFacade;

public class OcultarTeclado implements Interaction {

    public static OcultarTeclado ahora() {
        return Tasks.instrumented(OcultarTeclado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtener el WebDriverFacade
        WebDriverFacade webDriverFacade = (WebDriverFacade) ThucydidesWebDriverSupport.getDriver();

        // Obtener el driver real de Appium
        AppiumDriver driver = (AppiumDriver) webDriverFacade.getProxiedDriver();

        try {
            ((AndroidDriver) driver).hideKeyboard(); // Método nativo de Appium
        } catch (Exception e) {
            // Ignorar si ya está oculto
        }
    }
}


