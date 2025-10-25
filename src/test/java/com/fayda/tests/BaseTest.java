package com.fayda.tests;

import com.fayda.drivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.fayda.drivers.DriverManager.driver;

public class BaseTest {

    @BeforeMethod
    public void setupDriver(){
        DriverManager.getDriver("chrome");
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void killDriver(){
        DriverManager.tearDown();
    }
}
