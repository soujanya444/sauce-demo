package com.fayda.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class DriverManager {

    public static ThreadLocal<WebDriver> driverObject=new ThreadLocal<>();

    public static void getDriver(String browser) throws MalformedURLException {
        WebDriver driver;
        boolean isRemote=Boolean.valueOf(System.getProperty("remote"));
        System.out.println("Is Remote Execution: ****"+isRemote);
        if(isRemote){
            ChromeOptions options=new ChromeOptions();
            driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
        }else {
            if (browser.equalsIgnoreCase("chrome")) {
                final Map<String, Object> chromePrefs = new HashMap<>();
                chromePrefs.put("credentials_enable_service", false);
                chromePrefs.put("profile.password_manager_enabled", false);
                chromePrefs.put("profile.password_manager_leak_detection", false);
                final ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("prefs", chromePrefs);
                driver = new ChromeDriver(chromeOptions);
            } else if (browser.equalsIgnoreCase("firefox")) {
                driver = new FirefoxDriver();
                driverObject.set(driver);
            } else {
                driver = new EdgeDriver();
            }
        }
        driverObject.set(driver);
    }

    public static void tearDown(){
        if(driverObject.get()==null)
            System.out.println("Driver object is not initialized...");
        driverObject.get().quit();
    }
}
