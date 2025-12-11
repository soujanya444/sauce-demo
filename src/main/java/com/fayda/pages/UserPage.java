package com.fayda.pages;

import org.openqa.selenium.By;

import static com.fayda.utils.ElementUtils.click;
import static com.fayda.utils.ElementUtils.sendKeys;

public class UserPage {
    private static final By userNameTextField=By.id("first-name");
    private static final By lastNameTextField=By.id("last-name");
    private static final By postalCode=By.id("postal-code");
    private static final By continueButton=By.id("continue");

    public static void submitUserDetails(){
        sendKeys(userNameTextField,"Soujanya");
        sendKeys(lastNameTextField,"M");
        sendKeys(postalCode,"13547");
        click(continueButton);
    }
}
