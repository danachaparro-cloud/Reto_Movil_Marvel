package com.pragma.marvel.interaction;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScrollToTarget implements Interaction {

    private final Target target;

    public ScrollToTarget(Target target) {
        this.target = target;
    }

    public static ScrollToTarget the(Target target) {
        return instrumented(ScrollToTarget.class, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver()).getProxiedDriver();
        AndroidDriver driverAndroid = (AndroidDriver) driver;  // 👈 ya no MobileElement

        int maxScrolls = 5;
        int alreadyScrolled = 0;

        while (alreadyScrolled < maxScrolls && !target.resolveFor(actor).isVisible()) {
            int screenHeight = driverAndroid.manage().window().getSize().height;
            int screenWidth = driverAndroid.manage().window().getSize().width;

            int startX = screenWidth / 2;
            int startY = (int) (screenHeight * 0.8); // parte baja
            int endY = (int) (screenHeight * 0.2);   // parte alta

            ((JavascriptExecutor) driverAndroid).executeScript("mobile: swipeGesture", ImmutableMap.of(
                    "left", startX,
                    "top", startY,
                    "width", 0,
                    "height", endY,
                    "direction", "up",
                    "percent", 0.8
            ));

            alreadyScrolled++;
        }

        if (!target.resolveFor(actor).isVisible()) {
            throw new AssertionError("No se encontró el elemento: " + target.getName());
        }
    }
}



