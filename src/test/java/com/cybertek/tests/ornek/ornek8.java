package com.cybertek.tests.ornek;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ornek8 {

    WebDriver driver;

    @BeforeClass
    public void setUpClass(){
         driver = WebDriverFactory.getDriver("chrome");

    }
@BeforeMethod
    public void dropdown_test1() {

        //3.Verify "Simple dropdown" default selected value is correct
        //Expected:"Please select an option"
    driver.get("http://practice.cybertekschool.com/dropdown");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }
    @Test
   public void test2_verify_state_dropdown() throws InterruptedException {

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");

        Thread.sleep(1000);
        stateDropdown.selectByValue("GA");

        Thread.sleep(1000);
        stateDropdown.selectByIndex(2);

        Select yearDropDown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropDown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropDown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        Thread.sleep(1000);
        yearDropDown.selectByVisibleText("2014");

        Thread.sleep(1000);
        monthDropDown.selectByValue("7");

        Thread.sleep(1000);
        dayDropDown.selectByIndex(29);


    }



    }
