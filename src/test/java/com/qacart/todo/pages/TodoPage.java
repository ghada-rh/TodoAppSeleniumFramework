package com.qacart.todo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TodoPage extends BasePage{
    @FindBy(css = "[data-testid=\"welcome\"]")
    private WebElement welcomMsg;

    @FindBy(css = "[data-testid=\"add\"]")
    private WebElement addTodBtn;

    @FindBy(css="[data-testid=\"todo-item\"]")
    private WebElement todoItem;

    @FindBy(css = "[data-testid=\"delete\"]")
    private WebElement deletebtn;

    @FindBy(css = "[data-testid=\"no-todos\"]")
    private WebElement noTodosMsg;

    public TodoPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnAddBtn(){
        addTodBtn.click();
    }

    public String getTodoText(){
        return todoItem.getText();
    }

    public boolean isWelcomMsgDisplayed(){
        return welcomMsg.isDisplayed();
    }

    public void ClickOnDeleteButton(){
        deletebtn.click();
    }
    public boolean isNoTodosMsgDisplayed(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(noTodosMsg));
        return noTodosMsg.isDisplayed();
    }
}
