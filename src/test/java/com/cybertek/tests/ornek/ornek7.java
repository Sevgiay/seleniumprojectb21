package com.cybertek.tests.ornek;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ornek7 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement check1 =driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement check2=driver.findElement(By.xpath("//input[@name='checkbox2']"));
        Thread.sleep(1000);
        check2.click();
        Thread.sleep(1000);
        check1.click();


    }
}
