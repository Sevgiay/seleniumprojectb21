package com.cybertek.tests.day7_alerts_Iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Window_Handle_Practice {

    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {

        //Open browser
        driver = WebDriverFactory.getDriver("chrome");

        //Go to website
        driver.get("http://practice.cybertekschool.com/windows");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void Window_Handling_test(){
        //4-Assert : Title is "Practice"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";

        Assert.assertEquals(actualTitle,expectedTitle);

        //5-Click to "Click Here" Text
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

        String titleAfterClick = driver.getTitle();
        System.out.println("TitleAfterClick = "+titleAfterClick);

        String mainHandle = driver.getWindowHandle();
        System.out.println("MainHandle = "+mainHandle);

        //Similar to ArrayList, but SET CAN ONLY STORE UNIQUE VALUE
        //You can not have two of the value:String1 , String2
        Set<String>windowHandles =driver.getWindowHandles();

        //6-Switch to new window
        for (String each : windowHandles){

            driver.switchTo().window(each);
            System.out.println("Current Title While Switching :"+driver.getTitle());
        }


        //7-Assert: Title is "New Window"
        String finalExpectedTitle="New Window";
        String finalActualTitle =driver.getTitle();

        Assert.assertEquals(finalActualTitle,finalExpectedTitle);

        //if
        driver.switchTo().window(mainHandle);
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(5000);
        // driver.close();
    }
}
