package com.cybertek.tests.day4_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class P3_Checkbox_Practices {
    public static void main(String[] args) throws InterruptedException {


        ////Practice: Cybertek Checkout
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //1.Go to http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       //Locating checkboxes
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        //another option as locator for checkboxes : //form[@id='checkboxes']/input[1]
        //another option as locator for checkboxes : //form[@id='checkboxes']/input[2]

        //2.Confirm checkbox #1 is NOT selected by default
        if (!checkbox1.isSelected()){
            System.out.println("Checkbox#1 is NOT SELECTED.Default value verification PASSED!");
        }else {
            System.out.println("Checkbox#1 is SELECTED.Default value verification FAILED!");
        }

        //3.Confirm checkbox #2 is SELECTED by default
        if (checkbox2.isSelected()){
            System.out.println("Checkbox#2 is SELECTED.Default value verification PASSED!");
        }else {
            System.out.println("Checkbox#2 is NOT SELECTED.Default value verification FAILED!");
        }

        //4.Click checkbox #1 to selecct it
        Thread.sleep(2000);
        checkbox1.click();

        //5.Click checkbox #2 to deselect it
        Thread.sleep(2000);
        checkbox2.click();//cunku ilk sayfa acildigi zaman checkbox 2 clik oldugu icin uzerine click yapildiginda secilmemis oluyor

        //6.Confirm checkbox #1 is SELECTED
        if (checkbox1.isSelected()) {
                System.out.println("Checkbox#1 is SELECTED.Default value verification PASSED!");
            }else {
                System.out.println("Checkbox#1 is NOT SELECTED.Default value verification FAILED!");
            }

        //7.Confirm checkbox #2 is NOT SELECTED
     if (!checkbox2.isSelected()){
        System.out.println("Checkbox#2 is NOT SELECTED.Default value verification PASSED!");
    }else {
        System.out.println("Checkbox#2 is SELECTED.Default value verification FAILED!");
    }
     //clicking to home link
        driver.findElement(By.linkText("Home")).click(); //link textlerde a lari alabiliyoruz

     //Clicking to home link

        Thread.sleep(2000);
        driver.navigate().back();

   //re locating the web elementh to refresh the driver's references to it
    checkbox1 = driver.findElement(By.xpath(("//input[@type='checkbox'][1]")));

    //clicking
     checkbox1.click();
    }
}