package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P2_MerriamWebster_Practice {

    public static void main(String[] args) {

        //Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //2.Go to http://www.merriam-webster.com/
        driver.get("http://www.merriam-webster.com/");
        driver.manage().window().maximize();

        //implicit wait used by findElement method to have additional time when
        //not able to find element immediately
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //3.Print out the texts of all links
        List<WebElement>allLinks = driver.findElements(By.xpath("//body//a"));

        int linkWithText = 0;
        int linksWithoutText = 0;

        for (WebElement eachLink : allLinks){

            String textOfEachLink = eachLink.getText();

            System.out.println(eachLink.getText());
          //isEmpt given error
         //   check --> Preferences -->Java compiler >byte code as list 8
            if (textOfEachLink.isEmpty()){
                linksWithoutText++;
            }else {
                linkWithText++;
            }


        }

        //4.Print out how many links is missing text

        System.out.println("linksWithoutText = " + linksWithoutText);

        //5.Print out how many links has text
        System.out.println("linkWithText = " + linkWithText);

        //6.Print out how many total link

        int numberOfLinks = allLinks.size();

        System.out.println("numberOfLinks = " + numberOfLinks);

    }
}
