package com.cybertek.tests.day4_findElement_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_Xpath_CssSelector {

    public static void main(String[] args) {

        //TC #1: PracticeCybertek.com_ForgatPassword WebElement verification
        //1. Open Chrome Browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //3.Locate all the WebElements on the page using XPATH and/or CSS locator only

        //a-"Home" link
        WebElement homeLink = driver.findElement(By.xpath("Home"));

        //Locating the same link using class attribute's value
        //Webelement homeLink = driver.finElementh(By.xpath("//a[@class ='nav-link'));

        //Locating the same link using class attribute's value
        //Webelement homeLink = driver.finElementh(By.xpath("//a[@href ='/'));

        //b-"Forgat password" header
        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        //c-"E-mail" text
        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        //Locating the label using its TEXT with XPATH
        //WebElementh emailLabel = driver.findElement(By.xpath("//label[.='E-mail]));


        //d-E-mail input text
        WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='text']"));
        //e-"Retrieve password" button
        //f- "Powered by Cybertek School " text
        //4- Verify all WebElements are displayed

    }
}
