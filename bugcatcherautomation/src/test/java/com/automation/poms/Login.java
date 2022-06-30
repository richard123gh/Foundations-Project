package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// this class is going to be my java version of my login webpage
public class Login {
    // by defining what web elements you want to interact with here instead of the steps themselves,
    // we avoid writing "boilerplate" (redundant/repetitive) code.

    // needed to correctly grab information from login webpage
    // private because driver will be used internally (in the class) to interact with things in the pom
    private WebDriver driver;
     
    // fields to represent user actions
    // public because they will be accessed in the steps
    @FindBy(id = "username")
    public WebElement usernameInput;
    @FindBy(id = "password")
    public WebElement passwordInput;
    @FindBy(tagName = "button")
    public WebElement loginButton;

    // constructor needed to initialize the fields above
    public Login(WebDriver driver){
        this.driver = driver; // initializes private driver field
        /*
        PageFactory class provided by Selenium abstracts away the code that handles initializing 
        our WebElement fields.  We simply provide the initElements() method with the private driver
        we initialize above, and the PageFactory class handles the rest. 
        */
        PageFactory.initElements(driver,this);
    }

// these methods are public so they can be accessed via steps, and return type void 
// because the functions do not return any values:  they just interact with the page
    public void enterUsername(String username){
        this.usernameInput.sendKeys(username);
    }

    public void enterPassword(String password){
        this.passwordInput.sendKeys(password);
    }

    public void clickButton(){
        this.loginButton.click();
    }
}
