package com.mylaptop.asts.test.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.mylaptop.asts.test.stepDefinitions",
        plugin = {"pretty", "html:target/cucumber-reports.html"},
        tags = "@LoginTest"
)
public class TestRunner {
}
