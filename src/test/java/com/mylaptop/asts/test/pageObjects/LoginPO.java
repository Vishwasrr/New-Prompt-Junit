package com.mylaptop.asts.test.pageObjects;

import com.mylaptop.asts.test.constants.LocatorFileConstant;
import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@Getter
public class LoginPO extends BasePO {
    private final By usernameField;
    private final By passwordField;
    private final By loginButton;

    public LoginPO() {
        this.usernameField = By.xpath(LocatorFileConstant.getLocator("username"));
        this.passwordField = By.xpath(LocatorFileConstant.getLocator("password"));
        this.loginButton = By.xpath(LocatorFileConstant.getLocator("loginButton"));
    }

    public WebElement getUsernameField(WebDriver driver) {
        return driver.findElement(usernameField);
    }

    public WebElement getPasswordField(WebDriver driver) {
        return driver.findElement(passwordField);
    }

    public WebElement getLoginButton(WebDriver driver) {
        return driver.findElement(loginButton);
    }
}
