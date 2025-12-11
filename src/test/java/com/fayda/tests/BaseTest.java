package com.fayda.tests;

import com.fayda.drivers.DriverManager;
import com.fayda.utils.PropertyUtils;
import com.fayda.utils.Reporters;
import org.testng.annotations.*;

import java.lang.reflect.Method;
import java.net.MalformedURLException;

import static com.fayda.drivers.DriverManager.driverObject;
import static com.fayda.drivers.DriverManager.getDriver;
import static com.fayda.utils.PropertyUtils.getProperty;

public class BaseTest {

    @BeforeSuite
    public void initTests(){
        PropertyUtils.initProperties();
        Reporters.initReporter();
    }

    @BeforeMethod
    @Parameters({ "browser" })
    public void setupDriver(@Optional String browser, Method method) throws MalformedURLException {
        Reporters.initReportTest(method.getName());
        String browserRunValue=System.getProperty("browser");
        if(browserRunValue!=null)
            browser=browserRunValue;
        getDriver(browser);
        driverObject.get().get(getProperty("URL"));
    }

    @AfterMethod
    public void killDriver(){

        DriverManager.tearDown();
    }

    @AfterSuite
    public void closeTests(){

        Reporters.flushReport();
    }
}
