package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester {
      
    private WebDriver driver;

    @FindBy(id = "table")
    public WebElement table;
    @FindBy(tagName = "button")
    public WebElement updateButton;
    @FindBy(tagName = "alert")
    public WebElement alert;

    public Tester(WebDriver driver) {
        this.driver = driver;
    
        PageFactory.initElements(driver,this);
    }

    public void clickButton() {
        this.updateButton.click();
    }

    public void alert() {
        driver.switchTo().alert().accept();
    }
    
}