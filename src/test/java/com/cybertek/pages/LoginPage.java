package com.cybertek.pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //1- We intialize driver and object of current class by using
    //PageFactory.initElements(driver, this);

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    //2-We use @FindBy Annotation
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement inputUserName;

    @FindBy( id = "ctl00_MainContent_password")
    public WebElement inputpassword;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(id = "ctl00_MainContent_status")
    public WebElement errorMessage;
}
