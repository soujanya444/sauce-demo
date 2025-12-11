package com.fayda.utils;

import com.fayda.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.fayda.drivers.DriverManager.driverObject;
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
        driverObject.get().findElement(element).click();
    }

    public static void sendKeys(By element, String text){
        presenceOfElement(element);
        driverObject.get().findElement(element).sendKeys(text);
    }

    public static String getText(By element){
       presenceOfElement(element);
       return driverObject.get().findElement(element).getText();
    }
}
