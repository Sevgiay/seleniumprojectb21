package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrder_Utils {




    public static void loginToSmartBear(WebDriver driver){
        //3.Enter userName = "Tester"
        WebElement inputUserName = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUserName.sendKeys("Tester");

        //4.Enter password: "test"
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        //5.Click to login button
        WebElement loginButton =driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

    }
}
