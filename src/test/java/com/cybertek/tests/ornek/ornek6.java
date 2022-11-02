package com.cybertek.tests.ornek;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ornek6 {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        driver.manage().window().maximize();


        driver.findElement(By.xpath("//a[.='Home']")).click();

        driver.findElement(By.xpath("//a[.='A/B Testing']")).click();
    }
}
