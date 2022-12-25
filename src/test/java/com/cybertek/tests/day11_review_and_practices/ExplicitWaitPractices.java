package com.cybertek.tests.day11_review_and_practices;

import com.cybertek.pages.DynamicLoad1Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    @Test
    public void dynamic_load_page1(){
        //Dynamically Loaded Pace Elements1
        //Go to link
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/1");

        //Creating the object of the class to be able to  reach web elements from that class
        DynamicLoad1Page dynamicLoad1Page = new DynamicLoad1Page();

        //Click to start
        dynamicLoad1Page.startButton.click();

        //Wait until loading bar disappears
        //To be able to wait until loading bar disappears we will use WebDriverWait class and its obj
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        //using the object, we will create our expected condition:Wait unntil bar dissepears
        wait.until(ExpectedConditions.invisibilityOf(dynamicLoad1Page.loadindBar));

        //Assert username inputbox is displayed
        Assert.assertTrue(dynamicLoad1Page.Inputusername.isDisplayed());

        //Enter username : tomsmith
        dynamicLoad1Page.Inputusername.sendKeys("tomsmith");

        //Enter password : incorrectpassword
        dynamicLoad1Page.Inputpassword.sendKeys("asdfdsa");

        //Click to submit button
        dynamicLoad1Page.submitButton.click();

        //Assert "Your password invalid!" text is displayed
        Assert.assertTrue(dynamicLoad1Page.errorMessage.isDisplayed());

        //Note:Follow POM Design Pattern
    }
}
