package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_GmailTitleVerification {
    public static void main(String[] args) {
        /*
        ---To be able to click or do any other action on any specific WebElement , we need to locate that web element for Selenium Webelement
        ---To be able to locate a web element , we need to use a new method from selenium Library

                .findElement();
        --findElementh() method finds and returns us One WEBELEMENT with given LOCATOR
        --findElement() method accepts 1 argument as Locator so that it can use this locator to find elements for us

                -LOCATOR Methods are coming from Selenium library
        -There are 8 types of different locators.
        -In today's class we are going to learn 6 of the 8 locators

        syntax : driver.findElement(By.LOCATOR):

        LOCATORS OF SELENIUM
        1- linkText :
        -linkText locator locates a web element with given text.
        -This locator can only be use to find LINKS
        -We need to make sure the web element is link before using this locator.
                -We need to pass the TEXT of the link , and driver will return us the web element that contains that TEXT.

                <a href ="https://www.gmail.com">GMAIL</a>

     > Tag Name / the type of web element : <a>
     > Attribute Name : href
     > Attribute value : htpps://www.gmail.com
     > The text of this Web Element : GMAIL


        When drivers opens a new browser it will not have ant cache ..Which means you will not be logged into anything. And also
        you will not have any browser history.

                Opening inspection tool
        by regular way : regt click on the page , select "inspect"
        by keyword shortcut
                - MAC : cmd + shift + d
                -WINDOW : cntrl + shift + c

    #2 - partiallinkTex()
    -This is very similar to linkText() locator.
    -linkText locator will look for EXACT text matches
    -partialLinkText locator will look for PARTIAL text matches
    -We can only use this locator with anchor tags <a>(link)

         <a href ="https://www.gmail.com">CLICK HERE TO GO GMAIL</a>

         syntax :
         driver.findElement(By.partialLinkText("CLICK HERE TO GO GMAIL"));
         driver.findElement(By.partialLinkText("CLICK"));
         driver.findElement(By.partialLinkText(" HERE "));
         driver.findElement(By.partialLinkText("TO"));
         driver.findElement(By.partialLinkText("GMAIL"));

    Which to methods from java we can compare these two methods(linkText vs partialLinkText)?
        -.contains() vs .equals
        -.partialLinkText() vs linkText()
        -.partialLinkText() is similar to .contains() methods from java. It looks for partial match up.
        -linkText() is similar to .equals() method from java. It looks for EXACT match.

    #3 -name
        -name is one of 8 locators is Selenium
        -driver looks through HTML code and checks all of the name attribute values
        -and it will return the web element with matching name attribute value

        syntax : driver.findElementh(By name("name attribute value"));

        ex = <a href="https://www.gmail.com" name="abt9"> CLICK HERE TO GO GMAIL </a>
        driver.findElementh(By.name("abt9")).click();

                */

        //#3: Back and forth navigation
        //1- Open a chrome Browser
        //setup
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver = new ChromeDriver();

        //2- Go to : https://google.com
        driver.get("https://www.google.com");

        //this line will maximize(full screen) our currently opened browser
        driver.manage().window().maximize();

        //3- Click to gmail from top right
        //To be able to click , we need to locate the web element from the page
        driver.findElement(By.linkText("Gmail")).click();

        //4- Verify title contains
        //Expected : Gmail
        String expectedInTitle = "Gmail";
        String actuhalTitle = driver.getTitle();

        if (actuhalTitle.contains(expectedInTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }


        //5- Go back to Google by using the .back()
        driver.navigate().back();


        //6- Verify title equals:
        //Expected : Google

        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification PASSED!");
        }else {
            System.out.println("Google title verification FAILED!");
        }
        driver.close();
    }
}