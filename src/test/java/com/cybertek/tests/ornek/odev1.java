package com.cybertek.tests.ornek;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class odev1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        Thread.sleep(1000);
        WebElement Homelink = driver.findElement(By.linkText("Home"));
        Homelink.click();

        Thread.sleep(1000);
        driver.navigate().back();

        Thread.sleep(1000);
        WebElement emailbox = driver.findElement(By.xpath("//input[@name='email']"));
        emailbox.sendKeys("fztsevgiayy@gmail.com");

        Thread.sleep(1000);
        WebElement retrobutton = driver.findElement(By.className("radius"));
        retrobutton.click();

        String expextitTitle = "email_sent";
        String actualTitle = driver.getCurrentUrl();

        if (actualTitle.contains(expextitTitle)){
            System.out.println("PASSSSSSSSSSSSSSSSSSSS");
        }else {
            System.out.println("FAILEDDDDDDDDDD");
        }


    }
}
