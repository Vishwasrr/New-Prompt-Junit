package com.mylaptop.asts.test.utils;

import com.mylaptop.asts.test.pageObjects.BasePO;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    @Before
    public void setUp(Scenario scenario) {
        System.out.println("Running Scenario: " + scenario.getName());
        BasePO.initializeDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println("Finished Scenario: " + scenario.getName());
        System.out.println("TearDown: Closing browser...");
        BasePO.closeDriver();
        System.out.println("TearDown: Browser closed.");
    }
}
