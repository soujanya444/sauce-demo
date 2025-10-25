package com.fayda.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;


import static com.fayda.drivers.DriverManager.driver;
import static com.fayda.utils.Waiters.getFluentWait;

public class ElementUtils {

    public static void elementToBeClickable(By element){
        getFluentWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void presenceOfElement(By element){
        getFluentWait().until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public static void click(By element){
        presenceOfElement(element);
        elementToBeClickable(element);
        driver.findElement(element).click();
    }

    public static void sendKeys(By element, String text){
        presenceOfElement(element);
        driver.findElement(element).sendKeys(text);
    }

    public static String getText(By element){
       presenceOfElement(element);
        return driver.findElement(element).getText();
    }
}
