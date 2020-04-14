package com.epam.testng.listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

    public void onTestSuccess(ITestResult result) {
        System.out.println("Passed successfully: " + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("Failed: " + result.getName());
    }

}
