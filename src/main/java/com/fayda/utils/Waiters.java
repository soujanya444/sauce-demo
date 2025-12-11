package com.fayda.utils;

import com.fayda.drivers.DriverManager;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

import static com.fayda.drivers.DriverManager.driverObject;

public class Waiters {
    public static FluentWait<WebDriver> getFluentWait(){
        return new FluentWait<>(driverObject.get()).withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
    }
}
