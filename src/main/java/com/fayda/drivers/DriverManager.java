package com.fayda.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverManager {

    public static WebDriver driver;

    public static void getDriver(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            final Map<String, Object> chromePrefs = new HashMap<>();
            chromePrefs.put("credentials_enable_service", false);
            chromePrefs.put("profile.password_manager_enabled", false);
            chromePrefs.put("profile.password_manager_leak_detection", false);
            final ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setExperimentalOption("prefs", chromePrefs);
            driver=new ChromeDriver(chromeOptions);
        }else if(browser.equalsIgnoreCase("firefox")){
            driver=new FirefoxDriver();
        }else {
            driver=new EdgeDriver();
        }
    }

    public static void tearDown(){
        if(driver==null)
            System.out.println("Driver object is not initialized...");
        driver.quit();
    }
}
