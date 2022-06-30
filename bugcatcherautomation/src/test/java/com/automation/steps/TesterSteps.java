package com.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.automation.runner.TestRunner;
 
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class TesterSteps {
    @Given("the tester is on their correct home page")
    public void the_tester_is_on_their_correct_home_page() {
        TestRunner.driver.get("File://C:/git/Foundations-Project/bugcatcherautomation/src/test/resources/webpages/tester.html");
    }
     @When("the tester looks at the table")
    public void the_tester_looks_at_the_table() {
        TestRunner.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("table")));
    }

    @Then("the tester should see pending defects assigned to them")
    public void the_tester_should_see_pending_defects_assigned_to_them() {
        String tester = TestRunner.driver.findElement(By.id("user")).getText();
    }

    @When("the tester selects declined from the status dropdown menu")
    public void the_tester_selects_declined_from_the_status_dropdown_menu() {
        TestRunner.driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        Select updateDefect = new Select(TestRunner.driver.findElement(By.className("selection")));
        updateDefect.selectByVisibleText("Declined");
    
    }

    @When("the tester clicks the update defect button")
    public void the_tester_clicks_the_update_defect_button() {
        TestRunner.tester.clickButton();
    }

    @Then("A status alert should declare the defect updated from pending to declined")
    public void a_status_alert_should_declare_the_defect_updated_from_pending_to_declined() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent()); // 
        String alertText = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Defect updated to Declined.", alertText);
        TestRunner.tester.alert();
    }

    @When("the tester selects accepted from the status dropdown menu")
    public void the_tester_selects_accepted_from_the_status_dropdown_menu() {
        Select updateDefect = new Select(TestRunner.driver.findElement(By.className("selection")));
        updateDefect.selectByVisibleText("Accepted");
    }

    @Then("A status alert should declare the defect updated from pending to accepted")
    public void a_status_alert_should_declare_the_defect_updated_from_pending_to_accepted() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent()); // 
        String alertText = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Defect updated to Accepted.", alertText);
        TestRunner.tester.alert();
    }

    @When("the tester selects rejected from the status dropdown menu")
    public void the_tester_selects_rejected_from_the_status_dropdown_menu() {
        Select updateDefect = new Select(TestRunner.driver.findElement(By.className("selection")));
        updateDefect.selectByVisibleText("Rejected");
    }

    @Then("A status alert should declare the defect updated from accepted to rejected")
    public void a_status_alert_should_declare_the_defect_updated_from_accepted_to_rejected() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent()); // 
        String alertText = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Defect updated to Rejected.", alertText);
        TestRunner.tester.alert();
    }

    @When("the tester selects fixed from the status dropdown menu")
    public void the_tester_selects_fixed_from_the_status_dropdown_menu() {
        Select updateDefect = new Select(TestRunner.driver.findElement(By.className("selection")));
        updateDefect.selectByVisibleText("Fixed");
    }

    @Then("A status alert should declare the defect updated from accepted to fixed")
    public void a_status_alert_should_declare_the_defect_updated_from_accepted_to_fixed() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent()); // 
        String alertText = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Defect updated to Fixed.", alertText);
        TestRunner.tester.alert();
    }

    @When("the tester selects shelved from the status dropdown menu")
    public void the_tester_selects_shelved_from_the_status_dropdown_menu() {
        Select updateDefect = new Select(TestRunner.driver.findElement(By.className("selection")));
        updateDefect.selectByVisibleText("Shelved");
    }
    
    @Then("A status alert should declare the defect updated from accepted to shelved")
    public void a_status_alert_should_declare_the_defect_updated_from_accepted_to_shelved() {
        TestRunner.wait.until(ExpectedConditions.alertIsPresent()); // 
        String alertText = TestRunner.driver.switchTo().alert().getText();
        Assert.assertEquals("Defect updated to Shelved.", alertText);
        TestRunner.tester.alert();
    }
}
