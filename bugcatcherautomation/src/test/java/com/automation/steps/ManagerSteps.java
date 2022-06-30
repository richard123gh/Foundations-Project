package com.automation.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ManagerSteps {
    @Given("the manager is on their correct home page")
    public void the_manager_is_on_their_correct_home_page() {
        TestRunner.driver.get("File://C:/git/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/manager.html");
    } 
 
    @When("the manager enters a defect description")
    public void the_manager_enters_a_defect_description() {
        TestRunner.manager.enterDefect("test defect");
    }

    @When("the manager enters a tester username")
    public void the_manager_enters_a_tester_username() {
       TestRunner.manager.enterTester("Autotester");
    }

    @When("the manager clicks the submit button")
    public void the_manager_clicks_the_submit_button() {
        TestRunner.manager.clickButton();
    }
    
    @Then("the manager should see an alert that says defect assigned")
    public void the_manager_should_see_an_alert_that_says_defect_assigned() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent());
        String alertText = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("test defect has been successfully assigned to Autotester", alertText);
        TestRunner.manager.alert();
    }
}
