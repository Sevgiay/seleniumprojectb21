package com.cybertek.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        //1- Setup web driver manager
        WebDriverManager.chromedriver().setup();// cromu kurma methodu her clasta yazilmak zorunda
       // System.setProperty("chrome","path of driver");


        //2-Create instance of web driver and use it to open page
        // this is the line where the Selenium WebDriver opens the Browser
        WebDriver driver = new ChromeDriver();

        //3- Use the instance to get the URL we want
        driver.get("https://www.google.com");//

        driver.navigate().back();

    }
}
