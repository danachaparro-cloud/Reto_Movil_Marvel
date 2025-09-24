package com.pragma.marvel.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListaPage {
    public static Target addButtonFor(String personaje) {
        return Target.the("botón agregar de " + personaje)
                .located(By.xpath("//android.widget.TextView[@text='" + personaje + "']/following-sibling::android.widget.Button[@text='Agregar']"));
    }

    public static Target deleteButtonFor(String personaje) {
        return Target.the("botón eliminar de " + personaje)
                .located(By.xpath("//android.widget.TextView[@text='" + personaje + "']/following-sibling::android.widget.Button[@text='Eliminar']"));
    }
}

