package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {
          //#1- Open chrome browser and
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // go to : http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2-Locate all of the LINKS on the page , and print out all the texts
            //first we need to find  the  locator that is returning us all of the links in the page
            //body//a

            //second,store all of the links in to a List of WebElements
        List<WebElement> listofLinks =  driver.findElements(By.xpath("//body//a"));

           //third, create java logic to print out of the texts of all links

        for (WebElement eachlink :listofLinks){
            System.out.println(eachlink.getText());
        }

        // #3-Print out how many links on the page

        int numofLinks = listofLinks.size();
        System.out.println("numberOfLinks = "+numofLinks);

        driver.close();
        //Open Chrome
    }
}
