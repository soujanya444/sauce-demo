package com.fayda.tests;

import com.fayda.drivers.DriverManager;
import com.fayda.utils.PropertyUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.fayda.drivers.DriverManager.driver;
import static com.fayda.utils.PropertyUtils.getProperty;

public class BaseTest {

    @BeforeSuite
    public void initTests(){
        PropertyUtils.initProperties();
    }

    @BeforeMethod
    public void setupDriver(){
        DriverManager.getDriver("chrome");
        driver.get(getProperty("URL"));
    }

    @AfterMethod
    public void killDriver(){
        DriverManager.tearDown();
    }
}
