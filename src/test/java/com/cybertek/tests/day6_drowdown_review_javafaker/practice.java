package com.cybertek.tests.day6_drowdown_review_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practice {
    public static void main(String[] args) {


        WebDriver webDriver = WebDriverFactory.getDriver("chrome");

        webDriver.findElement(By.name("q")).sendKeys("apple");
    }
}