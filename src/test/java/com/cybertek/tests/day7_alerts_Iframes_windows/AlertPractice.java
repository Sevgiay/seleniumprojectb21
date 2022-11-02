package com.cybertek.tests.day7_alerts_Iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {
    /*

     */
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {

        //Open browser
        driver = WebDriverFactory.getDriver("chrome");

        //Go to website
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public  void p1_information_alert_test() throws InterruptedException {

        //Locating the button for alert to click
        WebElement informationAllertButton =  driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        //Clicking to the button for alert to bee displayed
        informationAllertButton.click();

        Thread.sleep(1000);

        //Click to Ok  button from to alert

        //swictching driver's focus to alert
        Alert alert = driver.switchTo().alert();

        //Use 'alert' instance to click and close the alert
        alert.accept();


        //Verify "You successfuly clicked an alert" text is displayed
        WebElement resultText = driver.findElement(By.id("result"));

        String actualtext = resultText.getText();
        String expectedText = "You successfully clicked an alert";


        Assert.assertEquals(actualtext,expectedText);
        Assert.assertTrue(resultText.isDisplayed());


    }
    @AfterMethod
     public void teardownMethod() throws InterruptedException {
            Thread.sleep(5000);
            driver.close();
        }



}
