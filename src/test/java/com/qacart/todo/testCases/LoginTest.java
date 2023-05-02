package com.qacart.todo.testCases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.TodoPage;
import com.qacart.todo.utils.ConfigUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentials() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        //loginPage.load();
        loginPage.login(ConfigUtils.getInstance().getEmail(), ConfigUtils.getInstance().getPassword());

        TodoPage todoPage = new TodoPage(driver);
        Assert.assertTrue(todoPage.isWelcomMsgDisplayed());

        driver.quit();
    }


}
