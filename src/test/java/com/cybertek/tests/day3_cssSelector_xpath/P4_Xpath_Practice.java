package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P4_Xpath_Practice {
    /*

    1 Tag Name
    //tagName[@attribute='value']
    2 For tex
    //tagName[.='text'] -->locating this web elementh using it's text

    How many different types of XPATH locators are there?
    There are 2 types of XPATH.

    #1- Absolute Xpath :
         -Absolute xpath stars with single slash "/"
         -Which means absolute xpath starts from the root element(html)
         -It goes 1 by 1 parent to child until we reach to the desired web element
         -This locator is NOT STABLE
         -NOT RECOMMENDED TO USE
         -It will break if there is any slight change in the web element structure

         /html/body/div/div[2]/div/


         it is a lot more reliable than absolute xpath because we are being a specific
         we can locate a parent and go to child
         we can locate a child and go to parent with xpath
         #3-

     */

    public static void main(String[] args) {
        //go to this link : http://practice.cybertekschool.com/multiple_buttons

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //locate button2 USING XPATH LOCATOR
        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2']"));// . tex value icin siyah yer kullaniliyor @ ise
        button2.click();

        //locate button1 Using XPATH LOCATOR
    }
}
