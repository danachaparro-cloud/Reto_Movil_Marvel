package com.pragma.marvel.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {

    public static final Target PERSONAJE_OBJETIVO = Target.the("Personaje Agent 13")
            .located(By.xpath("//android.widget.ImageView[@content-desc=\"AGENT 13\n" +
                    "Sharon Carter\"]"));

}


