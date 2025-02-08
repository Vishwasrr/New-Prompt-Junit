package com.mylaptop.asts.test.pageActions;

import com.mylaptop.asts.test.pageObjects.LoginPO;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final LoginPO loginPO;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginPO = new LoginPO();
    }

    public void enterUsername(String username) {
        loginPO.getUsernameField(driver).sendKeys(username);
    }

    public void enterPassword(String password) {
        loginPO.getPasswordField(driver).sendKeys(password);
    }

    public void clickLogin() {
        loginPO.getLoginButton(driver).click();
    }
}
