package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P2_ZerobankVerification {
    public static void main(String[] args) {


        //TC #2 : Zero Bank link text verification
        //1-Open Chrome Browser
        //setup

        //open browsernand create driver instance
        WebDriver driver = WebDriverFactory.getDriver("sdfv");//Iki satiri bu sekilde 1 satirda yazdi
        driver.manage().window().maximize();

        //2-Go to  http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        //3.Verify link text  from top left
       WebElement zeroBankLink = driver.findElement(By.className("brand"));



        //Expected : "Zero Bank"
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)){
            System.out.println("Link Text verification Passed!");
        }else {
            System.out.println("Link Text verification Failed!");
            System.out.println("actualLinkText = "+actualLinkText);
            System.out.println("expectedLinkText = "+expectedLinkText);

        }

        //4.Verify link href attribute value contains
        //Expected "index.html
        String expectedInHref = "index.html";
        String actualHref = zeroBankLink.getAttribute("href");

        if (actualHref.contains(expectedInHref)){
            System.out.println("Href value verification Passed");
        }else {
            System.out.println("HREF value verification Failed!!!");
            System.out.println("expectedInHref = "+expectedInHref);
            System.out.println("actualHref = " + actualHref);
        }

        System.out.println("expectedInHref = " + expectedInHref);
        System.out.println("actualHref = " + actualHref);

        driver.close();
    }
}