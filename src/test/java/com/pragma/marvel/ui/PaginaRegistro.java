package com.pragma.marvel.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRegistro {

    // Botón inicial para ir al registro
    public static final Target SIGNUP_BUTTON = Target.the("botón Sign up")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Sign up\"]"));

    // Campos del formulario
    public static final Target NAME_FIELD = Target.the("campo nombre")
            .located(By.xpath("//android.widget.ScrollView/android.widget.EditText[1]"));

    public static final Target EMAIL_FIELD = Target.the("campo correo")
            .located(By.xpath("//android.widget.ScrollView/android.widget.EditText[2]"));

    public static final Target PASSWORD_FIELD = Target.the("campo contraseña")
            .located(By.xpath("//android.widget.ScrollView/android.widget.EditText[3]"));

    public static final Target CONFIRM_PASSWORD_FIELD = Target.the("campo confirmar contraseña")
            .located(By.xpath("//android.widget.ScrollView/android.widget.EditText[4]"));

    // Selector de género
    public static final Target GENDER_DROPDOWN = Target.the("selector genero")
            .located(By.xpath("//android.widget.ScrollView/android.view.View[6]"));

    public static final Target GENDER_FEMALE = Target.the("opción género femenino")
            .located(By.xpath("//android.view.View[@content-desc=\"F\"]"));

    public static final Target GENDER_MALE = Target.the("opción género masculino")
            .located(By.xpath("//android.view.View[@content-desc=\"M\"]"));

    // Check términos
    public static final Target ACEPTAR_TERMINOS = Target.the("check aceptar terminos")
            .located(By.xpath("//android.widget.CheckBox"));

    // Botón de confirmación
    public static final Target REGISTER_BUTTON = Target.the("botón Registrar")
            .located(By.xpath("//android.widget.Button[@content-desc=\"Sign Up\"]"));

}

