package com.mylaptop.asts.test.stepDefinitions;

import com.google.gson.JsonObject;
import com.mylaptop.asts.test.pageObjects.LoginPO;
import com.mylaptop.asts.test.pageObjects.BasePO;
import com.mylaptop.asts.test.pageActions.LoginPage;
import com.mylaptop.asts.test.utils.ConfigReader;
import com.mylaptop.asts.test.utils.TestDataReader;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;

import static com.mylaptop.asts.test.utils.JsonReader.readJsonFile;

public class LoginStepDef {
    WebDriver driver;
    LoginPage loginPage;

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
//        BasePO.initializeDriver();
        driver = BasePO.getDriver();
        driver.get(ConfigReader.getProperty("url"));
        loginPage = new LoginPage(driver);
    }

    @When("User enters valid credentials")
    public void userEntersValidCredentials() {
        JsonObject jsonObject = readJsonFile();
        String username = jsonObject.getAsJsonObject("validUser").get("username").getAsString();
        String password = jsonObject.getAsJsonObject("validUser").get("password").getAsString();
        System.out.println("Username: " + username + ", Password: " + password);
//        loginPage.enterUsername(TestDataReader.getData(username));
//        loginPage.enterPassword(TestDataReader.getData(password));
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @And("Clicks on login button")
    public void clicksOnLoginButton() {
        loginPage.clickLogin();
    }

    @Then("User should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        System.out.println("User logged in successfully!");
    }
}
