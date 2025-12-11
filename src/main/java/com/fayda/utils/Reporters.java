package com.fayda.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporters {

    public static ExtentReports extent;
    public static ExtentTest extentTest;

    public static void initReporter(){
        extent = new ExtentReports();
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
    }

    public static void initReportTest(String testName){

        extentTest=extent.createTest(testName);
    }

    public static void flushReport(){
        extent.flush();
    }

}
