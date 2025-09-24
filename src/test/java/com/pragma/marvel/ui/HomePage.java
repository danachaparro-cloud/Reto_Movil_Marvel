package com.pragma.marvel.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target PERFIL = Target.the("perfil")
            .located(By.xpath("//android.view.View[@content-desc=\"Profile\"]"));
    public static final Target CERRAR_SESION = Target.the("botón cerrar sesión")
            .located(By.xpath("//android.widget.Button[contains(@content-desc,'Cerrar')]"));
    public static final Target ACEPTAR_CERRAR = Target.the("aceptar cerrar")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Accept\"]"));
    public static final Target BOTON_BUSCAR = Target.the("boton buscar")
            .located(By.xpath("//android.widget.Button"));
    public static final Target PERSONAJE_RESULTADO = Target.the("primer resultado")
            .located(By.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]"));
    public static final Target BARRA_BUSQUEDA = Target.the("barra buscar")
            .located(By.xpath("//android.widget.EditText"));
    public static final Target NO_EXISTE = Target.the("no existe")
            .located(By.xpath("//android.view.View[@content-desc=\"No heroes found\"]"));
}


