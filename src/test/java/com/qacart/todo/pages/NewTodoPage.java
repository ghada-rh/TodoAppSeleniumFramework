package com.qacart.todo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewTodoPage extends BasePage{

    @FindBy(css = "[data-testid=\"new-todo\"]")
    private WebElement newTodoInput;

    @FindBy(css = "[data-testid=\"submit-newTask\"]")
    private WebElement createTodoBtn;

    public NewTodoPage(WebDriver driver) {
        super(driver);
    }

    public void addNewTodo(String todo) {
        newTodoInput.sendKeys(todo);
        createTodoBtn.click();

    }
}
