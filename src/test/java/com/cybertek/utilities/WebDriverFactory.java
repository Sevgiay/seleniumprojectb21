package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


    public static WebDriver getDriver(String browserType) {
            if (browserType.toLowerCase().equalsIgnoreCase("chrome")){
                WebDriverManager.chromedriver().setup();

                return new ChromeDriver();

            }else if ((browserType.equalsIgnoreCase("firefox"))){
                WebDriverManager.firefoxdriver().setup();


                return new FirefoxDriver();

            }else {
                System.out.println("Given browser type does not exist.Driver = null!");
                return null;
            }


    }




        // Task : New Method Creation
        // Method name : getDriver
        // Static Method
        // Accept string argument : browserType  --> will deterwine what browser opens
        //   -> if "chrome" opens chrome browser
        //   -> if "firefox" opens firefox browser
        // return  Type :Web Driver




}