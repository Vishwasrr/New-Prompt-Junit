package com.mylaptop.asts.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver if necessary
        System.setProperty("webdriver.chrome.driver", "C:\\Everything\\Python\\python_stuff\\chromedriver.exe");

        // Initialize the WebDriver (Chrome)
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // Open a website
            driver.get("https://demowebshop.tricentis.com/login");

            // Sleep for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
