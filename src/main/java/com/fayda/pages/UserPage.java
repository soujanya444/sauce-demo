package com.fayda.pages;

import org.openqa.selenium.By;

import static com.fayda.drivers.DriverManager.driver;

public class UserPage {
    private static final By userNameTextField=By.id("first-name");
    private static final By lastNameTextField=By.id("last-name");
    private static final By postalCode=By.id("postal-code");
    private static final By continueButton=By.id("continue");

    public static void submitUserDetails(){
        driver.findElement(userNameTextField).sendKeys("Soujanya");
        driver.findElement(lastNameTextField).sendKeys("M");
        driver.findElement(postalCode).sendKeys("13547");
        driver.findElement(continueButton).click();
    }
}
