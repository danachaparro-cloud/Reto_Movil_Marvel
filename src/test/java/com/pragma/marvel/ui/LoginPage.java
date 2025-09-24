package com.pragma.marvel.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME_FIELD = Target.the("campo usuario")
            .located(By.xpath("//android.widget.EditText[1]"));
    // primer campo EditText (Email)

    public static final Target PASSWORD_FIELD = Target.the("campo contraseña")
            .located(By.xpath("//android.widget.EditText[2]"));
    // segundo campo EditText (Password)

    public static final Target LOGIN_BUTTON = Target.the("botón login")
            .located(By.xpath("//*[@content-desc='Log In']"));
}

