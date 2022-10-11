package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekTitleVerification {
    public static void main(String[] args) {


        // 1- Open Choreme Browser
        //setu my driver
        WebDriverManager.chromedriver().setup();

        //open Browser
        WebDriver driver = new ChromeDriver();


        //2- Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");


        //3- Verify URL contains
        //Expected : cybertekschool
        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        System.out.println("expectedInUrl = "+expectedInUrl);
        System.out.println("actualUrl = "+actualUrl);

        if (actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED!");
        }else {
            System.err.println("URL verification FAILED!!!");
        }
        //4. Verify Title:
        //Expected : Practice

        String expectedTitle = "Practice";
        String actualyTitle = driver.getTitle();

        if (actualyTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification Passed!!!!");
        }else {
            System.out.println("Title verification Failed!!!!");
        }
    }
}

