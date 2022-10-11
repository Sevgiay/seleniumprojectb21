package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_FacebookTitleVerification {
    public static void main(String[] args) {
      /*  At the end of our  tests , we are looking for comparing two things
        Actual RESULT VS EXPECTED RESULT

        Where do we get the EXPEXTED RESULT ?
        -Documentation : AC , Requirement Documents


       */


      // 1- Open chrome browser
        //Setup the browser driver
        WebDriverManager.chromedriver().setup();

        //Use WebDDriver instance to open the browser
        //This is the liine that opening the browser we select
        WebDriver driver = new ChromeDriver();

     //  2- Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

      // 3- Verify title:
      //  Expected : Facebook - Log in or Sign up
      // Actual : we need to get from browser using selenium

        String expectedTitle = "Facebook - Log In or Sign Up";

        String actualTitle = driver.getTitle();

   //doing verification by creating simple if condition below;

       if (actualTitle.equalsIgnoreCase(expectedTitle)){
           System.out.println("Title verification PASSED!");
       }else {
           System.out.println("Title verification FAILED !");
       }

       driver.close();
    }
}
