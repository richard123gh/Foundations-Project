package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
      
    private WebDriver driver;

    @FindBy(id = "defectInput")
    public WebElement defInput;
    @FindBy(id = "testerNames")
    public WebElement testerInput;
    @FindBy(tagName = "button")
    public WebElement assignButton;
    @FindBy(tagName = "alert")
    public WebElement alert;

    public Manager(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }

    public void enterDefect(String defectInput){
        this.defInput.sendKeys(defectInput);
    }

    public void enterTester(String testerNames){
        this.testerInput.sendKeys(testerNames);
    }

    public void clickButton(){
        this.assignButton.click();
    }

    public void alert(){
        driver.switchTo().alert().accept();
    }
}