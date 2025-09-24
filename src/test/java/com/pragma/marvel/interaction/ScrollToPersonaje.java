package com.pragma.marvel.interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;

import java.time.Duration;
import java.util.Collections;

public class ScrollToPersonaje implements Interaction {

    private final Target target;
    private final int maxSwipes;

    public ScrollToPersonaje(Target target, int maxSwipes) {
        this.target = target;
        this.maxSwipes = maxSwipes;
    }

    public static ScrollToPersonaje using(Target target) {
        return Tasks.instrumented(ScrollToPersonaje.class, target, 5); // por defecto 5 swipes
    }

    public static ScrollToPersonaje using(Target target, int maxSwipes) {
        return Tasks.instrumented(ScrollToPersonaje.class, target, maxSwipes);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Obtener driver real de Serenity
        AndroidDriver driver = (AndroidDriver) ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver()).getProxiedDriver();

        boolean encontrado = false;
        int intentos = 0;

        while (!encontrado && intentos < maxSwipes) {
            try {
                WebElement elemento = target.resolveFor(actor).getElement();
                if (elemento != null && elemento.isDisplayed()) {
                    encontrado = true;
                    break;
                }
            } catch (NoSuchElementException ignored) {

                // No está en la vista, hacemos swipe
            }

            // dimensiones y coordenadas del swipe (ajusta si hace falta)
            Dimension size = driver.manage().window().getSize();
            int startX = size.width / 2;
            int startY = (int) (size.height * 0.80); // desde 80% de alto
            int endY   = (int) (size.height * 0.30); // hasta 30% de alto

            // W3C pointer input (touch)
            PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
            Sequence swipe = new Sequence(finger, 1);
            swipe.addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), startX, startY));
            swipe.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), startX, endY));
            swipe.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));

            driver.perform(Collections.singletonList(swipe));

            // pequeño wait para que la UI se estabilice
            try { Thread.sleep(400); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }

            intentos++;
        }

        if (!encontrado) {
            throw new AssertionError("No se encontró el elemento " + target.getName() + " después de " + maxSwipes + " swipes.");
        }
    }
}






