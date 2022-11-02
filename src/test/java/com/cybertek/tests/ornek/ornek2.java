package com.cybertek.tests.ornek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ornek2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        driver.manage().window().maximize();

        Thread.sleep(1000);

        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if (expectedTitle.startsWith(actualTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAILED");
        }

        driver.close();



    }
}
