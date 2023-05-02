package com.qacart.todo.pages;

import com.qacart.todo.utils.ConfigUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Factory;

public class LoginPage extends BasePage{
    @FindBy(css = "[data-testid=\"email\"]")
    private WebElement emailInput;
    @FindBy(css = "[data-testid=\"password\"]")
    private WebElement passwordInput;
    @FindBy(css = "[data-testid=\"submit\"]")
    private WebElement submitBtn;

    public LoginPage(WebDriver driver){
        super(driver);
    }

    /*
    public void load(){
        driver.get(ConfigUtils.getInstance().getBaseUrl());
    }
    */

    public void login(String email, String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submitBtn.click();
    }
}
