package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HowerPractice {

    @Test
    public void hover_test(){
        //Go to lnk
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //locating all the web elements needed
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2 = Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));



        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));


        BrowserUtils.sleep(2);

        //We must create object of Actions class object to be able to use its method
        Actions actions = new Actions(Driver.getDriver());

        //Hover over to ifirst image
        actions.moveToElement(img1).perform();
        //actions.perform();

        //3-Assert
        //a-"name: user1" is displayed
        Assert.assertTrue(user1.isDisplayed(),"User1 is not displayed.FAILED!!!");
        BrowserUtils.sleep(1);

        //4.Hover over to second image
        actions.moveToElement(img2).perform();


        //5-Assert
        //a-"name: user2" is displayed
        Assert.assertTrue(user2.isDisplayed(),"User2 is not displayed.FAILED!!!");
        BrowserUtils.sleep(1);

        //6-Hover over to third image
        actions.moveToElement(img3).perform();

        //7-Confirm
        //a-"name: user3" is displayed
        Assert.assertTrue(user3.isDisplayed(),"User3 is not displayed.FAILED!!!");

        //Driver.closeDriver();
    }
}
