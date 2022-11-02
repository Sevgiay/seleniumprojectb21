package com.cybertek.tests.day7_alerts_Iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Iframe_Practice {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {

        //Open browser
        driver = WebDriverFactory.getDriver("chrome");

        //Go to website
        driver.get("http://practice.cybertekschool.com/iframe");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void iframe_test() {
        //Let's change driver's focus to the <iframe>
        //1- Locate a webElement
       // WebElement iframe = driver.findElement(By.id("mce_0_ifr"));

        //switching driver's focus to iframe using "switchTo" method
       // driver.switchTo().frame(iframe);

        //2- Pass index number
        //driver.switchTo().frame(0);//Eger bu index olani yazarsak yukaridaki iki satiri yazmaya  gerk yok

        //3-Pass id or attribute value(IF THERE ARE ANY)
        //if there is ID OR NAME ATRTRIBUTE VALUE , THEY CAN BE DIRECTLY PASSED AS A String
        driver.switchTo().frame("mce_0_ifr");

        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //4:Assert : "Your content goes here."Text is displayed
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //locating the header
       // driver.switchTo().\defaultContent(); //Bunu kullanirsak direk ana parent sayfasina gidiyor
        driver.switchTo().parentFrame(); //Bunu kullandigimiz zaman da bir onceki parent classa gidiyoruz

        WebElement headerText =driver.findElement(By.tagName("h3"));
        Assert.assertTrue(headerText.isDisplayed());


        //5.Assert : "An Frame containing the TinyMCEWSYIWYG Editor

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
       driver.close();
    }
}
