package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

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

    //Method : VerifyOrder
    //Create a method named verifyOrder in SmartBearUtilities class
    //Method takes WebDriver object and String(name)
    //Method should verify if given name exist in orders
    //This Method should simply accept a name(String), and assert whether
    //given name is in the list or not
    //Create a new   TestNG test to test if the method is working as expected

    public static void verifyOrder(WebDriver driver,String expectedName ){

        //1- Create a locator that is returning us all of the lists in the  table
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));


        //we need to loop throug 'allName' List of WebElement and make sure 'expectedName' is in there

        for (WebElement each : allNames){

            if (each.getText().equals(expectedName)){
                Assert.assertTrue(each.getText().equals(expectedName));
                return;
            }
        }
        //The only condition where the Assert.fail() line below executed is if 'expectedName' is not in the list

        //Assert.fail(); method will FAIL THE TEST NO MATTER WHAT
        Assert.fail("The expectedName is not in the table");


    }
}
