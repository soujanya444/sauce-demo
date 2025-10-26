package com.fayda.pages;

import com.fayda.utils.PropertyUtils;
import org.openqa.selenium.By;
import static com.fayda.utils.ElementUtils.click;
import static com.fayda.utils.ElementUtils.sendKeys;

public class LoginPage {
    private static final By userNameTextField=By.id("user-name");
    private static final By passwordTextField=By.id("password");
    private static final By loginButton=By.id("login-button");

    public static void login(){
        sendKeys(userNameTextField, PropertyUtils.getProperty("USERNAME"));
        sendKeys(passwordTextField,PropertyUtils.getProperty("PASSWORD"));
        click(loginButton);
    }
}
