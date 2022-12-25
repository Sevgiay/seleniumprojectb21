package com.cybertek.tests.pom_synchronization_jsExecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class jSExecutorPractices {

    @Test
    public void scroll_using_jsexecutor_test1() {
        //get the page
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");

        //Create instance of JSExecutor and cast our driver type to it
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Use "js" to reach JavascritExecutor
        //first one is for x axis , second is y axis
        //We are saying , move down 750 pixels using this is function

//Creating the loop just to scroll 750 pixels down 10 timmes.
        for (int i = 0; i < 10; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");
        }
//We can pass -pixell
        js.executeScript("window.scrollBy(0, -750)");
        BrowserUtils.sleep(1);
        js.executeScript("window.scrollBy(0, -750)");
    }


    @Test
    public void scroll_using_jsexecutor_test2() {

        Driver.getDriver().get("htpps://practice.cybertekschool.com/large");

        //Create obj of js executor
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));


        BrowserUtils.sleep(2);
        //use "js" with different javascript function
        js.executeScript("arguments[0].scrollIntoView(true)",cybertekSchoolLink);
        //this function says: scrollTo first argument(argument[0])

        BrowserUtils.sleep(2);
        //moving back up in the page
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);
    }

}