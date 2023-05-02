package com.qacart.todo.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public WebDriver initializeDriver() {
        String browser = System.getProperty("browser", "CHROME");
        WebDriver driver;
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "SAFARI":
                driver = new SafariDriver();
                break;
            default:
                throw new RuntimeException("The browser is not supported");
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
