package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Tester {
     
    private WebDriver driver;

    @FindBy(id = "table")
    public WebElement table;

    @FindBy(id = "22624")
    public WebElement dropDown;

    public void clickButton() {
    }

    // see alert
}