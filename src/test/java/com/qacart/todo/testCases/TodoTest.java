package com.qacart.todo.testCases;

import com.qacart.todo.base.BaseTest;
import com.qacart.todo.factory.DriverFactory;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.pages.NewTodoPage;
import com.qacart.todo.pages.TodoPage;
import com.qacart.todo.utils.ConfigUtils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TodoTest extends BaseTest {



    public void shouldBeAbleToAddNewTodo() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);
        //loginPage.load();
        loginPage.login(ConfigUtils.getInstance().getEmail(), ConfigUtils.getInstance().getPassword());


        TodoPage todoPage = new TodoPage(driver);
        todoPage.clickOnAddBtn();


        NewTodoPage newTodoPage = new NewTodoPage(driver);
        newTodoPage.addNewTodo("Build selenium Framework");

        String todoText = todoPage.getTodoText();
        Assert.assertEquals(todoText, "Build selenium Framework");
        driver.quit();
    }

    @Test
    public void shouldBeAbleToDeleteNewTodo() throws InterruptedException {


        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(ConfigUtils.getInstance().getEmail(), ConfigUtils.getInstance().getPassword());

        TodoPage todoPage = new TodoPage(driver);
        todoPage.clickOnAddBtn();

        NewTodoPage newTodoPage = new NewTodoPage(driver);
        newTodoPage.addNewTodo("Build selenium Framework");


        todoPage.ClickOnDeleteButton();
        Assert.assertTrue(todoPage.isNoTodosMsgDisplayed());
        driver.quit();
    }
}
