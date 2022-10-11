package com.cybertek.tests.day3_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_Amazon_cssSelectorTask {

    public static void main(String[] args) {

         //  1. Open Chrome browser
        //Using our utility to do SETUP + open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2. Go to http://www.amazon.com
        driver.get("http://www.amazon.com");

       //  3. Enter search term (use cssSelector to locate search box)
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtexbox']"));

       //Second syntax for css Selector : tagName#attributeValue
      //  WebElement amazonSearchBar = driver.findElement(By.cssSelector("input#twotabsearctexbox"));
        //tagname[attribute = 'value']

        amazonSearchBar.sendKeys("apple"+ Keys.ENTER);

      //  4. Verify title contains search term
        String expectedInTitle = "apple";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Title contains search key. Verification Passed!");
        }else {
            System.out.println("Title does not contain search key . Verification Failed!!!");
            System.out.println("expectedInTitle = " + expectedInTitle);
            System.out.println("actualTitle = " + actualTitle);
        }

    }


}
