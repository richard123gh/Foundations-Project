package com.automation.steps;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSteps {
    
    //user agnostic steps
    @Given("the employee is on the login page")     
    public void the_employee_is_on_the_login_page() {
        TestRunner.driver.get("File://C:/git/REV/projects/foundations/Login-automation/bugcatcherautomation/src/test/resources/webpages/login.html");
    }
    @When("the employee clicks the login button")   
    public void the_employee_clicks_the_login_button() {
        TestRunner.login.clickButton();
    } 
    //manager steps
    @When("the manager enters the correct username")
    public void the_manager_enters_the_correct_username() {
        TestRunner.login.enterUsername("Automanager");
    }
    @When("the manager enters the correct password")
    public void the_manager_enters_the_correct_password() {
        TestRunner.login.enterPassword("string");
    }
    @Then("the manager should be redirected to the manager home page")
    public void the_manager_should_be_redirected_to_the_manager_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Managers"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Managers", title);
    }

    //tester steps
    @When("the tester enters the correct username") 
    public void the_tester_enters_the_correct_username() {
        TestRunner.login.enterUsername("Autotester");
    }
    @When("the tester enters the correct password") 
    public void the_tester_enters_the_correct_password() {
        TestRunner.login.enterPassword("string");
    }
    @Then("the tester should be redirected to the tester home page")
    public void the_tester_should_be_redirected_to_the_tester_home_page() {
        TestRunner.wait.until(ExpectedConditions.titleIs("Custodians"));
        String title = TestRunner.driver.getTitle();
        Assert.assertEquals("Custodians", title);
    }
}
