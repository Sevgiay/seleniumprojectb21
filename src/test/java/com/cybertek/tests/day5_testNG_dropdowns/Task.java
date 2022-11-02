package com.cybertek.tests.day5_testNG_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Task {

    public static void main(String[] args) {
        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //Go to link
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.manage().window().maximize();

        //creating implicit wait for our findElement method
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //3.Verify "Success - Check Box is checked" message is Not displayed

        //Option  #1= Using xpath and id attribute value to locate successMessage

        //Option #2: Using xpath  and style attribute value : //div[@style='display:block;']

        //Option #3: Using xpath and text value: //div[.='Succes - Check box is checked ']

        //Option #4: Using xpath and text value: //div[text()='Succes - Check box is checked ']

        //Option #5: Using xpath and * instead of tagName: //*[@id='txtAge']

        WebElement successMessage = driver.findElement(By.xpath("//div[@id='txtAge']"));

        //locating checkbox
        WebElement checkbox = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));

        if (!checkbox.isSelected() && !successMessage.isDisplayed()){
            System.out.println("Checkbox is not selected .Message is not played .Verification PASS!");
        }else {
            System.out.println("FAIL!");
        }

        //4- Click to checkbox under "Single Checkbox Demo" section
        checkbox.click();

        //5-Verify "Success - Check box is checked" message is displayed
        if (checkbox.isSelected() && successMessage.isDisplayed()){
            System.out.println("Checkbox is  selected .Message is  played .Verification PASS!");
        }else {
            System.out.println("FAIL!");
        }

        driver.close();





        //
    }
}
