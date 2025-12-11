package com.fayda.pages;

import com.aventstack.extentreports.Status;
import com.fayda.utils.PropertyUtils;
import com.fayda.utils.Reporters;
import org.openqa.selenium.By;
import static com.fayda.utils.ElementUtils.click;
import static com.fayda.utils.ElementUtils.sendKeys;
import static com.fayda.utils.Reporters.extentTest;

public class LoginPage {
    private static final By userNameTextField=By.id("user-name");
    private static final By passwordTextField=By.id("password");
    private static final By loginButton=By.id("login-button");

    public static void login(){
        sendKeys(userNameTextField, PropertyUtils.getProperty("USERNAME"));
        sendKeys(passwordTextField,PropertyUtils.getProperty("PASSWORD"));
        click(loginButton);
        extentTest.log(Status.PASS, "Successfully Logged In");
    }
}
