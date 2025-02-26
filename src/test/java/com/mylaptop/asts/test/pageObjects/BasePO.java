package com.mylaptop.asts.test.pageObjects;

import com.mylaptop.asts.test.utils.ConfigReader;
import lombok.Getter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.ObjectInputFilter;

public class BasePO {
    @Getter
    protected static WebDriver driver;

    public static void initializeDriver() {
        System.out.println("Starting webdriver");
        System.setProperty("webdriver.chrome.driver", ConfigReader.getProperty("chromeDriverPath"));
        WebDriverManager.chromedriver().setup();
        String url;
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(ConfigReader.getProperty("url"));
        }
    }

    public static void closeDriver() {
        if (driver != null) {
            System.out.println("Closing the browser...");
            driver.quit();
            driver = null;
            System.out.println("Browser closed.");
        } else {
            System.out.println("Driver was already null, skipping close.");
        }
    }
}
