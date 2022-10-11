package com.cybertek.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT_CybertekLinkVerification {

    public static void main(String[] args) {

      //  TC  #3 : PracticeCybertek/ForgotPassword URL verification
       //1. Open Chrome Browser
        //setup
        WebDriverManager.chromedriver().setup();

        //create instance of browser
        WebDriver driver = new ChromeDriver();

       //2.Go to http://practice.cybertekschool.com/forgat_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3.Enter any e-mail into input box
        driver.findElement(By.name("email")).sendKeys("anything@anydomain.com");

       //4.Click on Retrieve password
        driver.findElement(By.id("form_submit")).click();

       //5.Verify URL contains
       //Expected "email_sent"
        String expectedInURL = "email_sent";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedInURL)){
            System.out.println("URL verification Passed!");
        }else {
            System.out.println("URL verification Failed!");
            System.out.println("actualUrl = "+actualUrl);
            System.out.println("expectedUrl = "+expectedInURL);
        }
        //6. Verify textbox displayed the content as expected
        //Expected: "Your e-mail's been sent!"

       WebElement confirmation_message = driver.findElement(By.name("confirmation_message"));

        //first verification is to check if it is displayed on the page or not

        if (confirmation_message.isDisplayed()){
            System.out.println("Confirmation message is displayed.Pass!!");
        }else {
            System.out.println("Confirmation message is Not displayed. Fail!!");
        }

        //Second verification : is to check the content of the confirmation_message web element
        //Expected :" Your e-mail's been sent! "
        String expectedMessage = "Your e-mail's been sent!";
       // String actualMessage = driver.findElement(By.name("confirmation_message")).getText();
        String actualMessage = confirmation_message.getText();

        if (actualMessage.equals(expectedMessage)){
            System.out.println("Message verification Passed!");
        }else {
            System.out.println("Message verification Failed!");
            System.out.println("expectedMessage "+expectedInURL);
            System.out.println(" actualMessage "+actualMessage);
        }

    }
}
