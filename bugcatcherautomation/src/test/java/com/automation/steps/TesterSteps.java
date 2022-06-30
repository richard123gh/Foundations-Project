package com.automation.steps;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {
    @Given("the tester is on their correct home page")
    public void the_tester_is_on_their_correct_home_page() {
        TestRunner.driver.get("File://C:/git/REV/projects/foundations/Login-automation/bugcatcherautomation/src/test/resources/webpages/tester.html");
    }
 
    @When("the tester looks at the table")
    public void the_tester_looks_at_the_table() {
        TestRunner.wait.until(ExpectedConditions.visibilityOf("table"));
    }

    @Then("the tester should see pending defects assigned to them")
    public void the_tester_should_see_pending_defects_assigned_to_them() {
        // ...table that contains tester information assigned to Autotester...
    }

    @When("the tester selects declined from the status dropdown menu")
    public void the_tester_selects_declined_from_the_status_dropdown_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the tester clicks the update defect button")
    public void the_tester_clicks_the_update_defect_button() {
        TestRunner.tester.clickButton();
    }

    @Then("A status alert should declare the defect updated from pending to declined")
    public void a_status_alert_should_declare_the_defect_updated_from_pending_to_declined() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the tester selects accepted from the status dropdown menu")
    public void the_tester_selects_accepted_from_the_status_dropdown_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("A status alert should declare the defect updated from pending to accepted")
    public void a_status_alert_should_declare_the_defect_updated_from_pending_to_accepted() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the tester selects rejected from the status dropdown menu")
    public void the_tester_selects_rejected_from_the_status_dropdown_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("A status alert should declare the defect updated from accepted to rejected")
    public void a_status_alert_should_declare_the_defect_updated_from_accepted_to_rejected() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the tester selects fixed from the status dropdown menu")
    public void the_tester_selects_fixed_from_the_status_dropdown_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("A status alert should declare the defect updated from accepted to fixed")
    public void a_status_alert_should_declare_the_defect_updated_from_accepted_to_fixed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the tester selects shelved from the status dropdown menu")
    public void the_tester_selects_shelved_from_the_status_dropdown_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    
    @Then("A status alert should declare the defect updated from accepted to shelved")
    public void a_status_alert_should_declare_the_defect_updated_from_accepted_to_shelved() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
