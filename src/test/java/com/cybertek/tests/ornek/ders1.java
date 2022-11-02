package com.cybertek.tests.ornek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ders1 {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");
        System.out.println("Title = "+driver.getTitle());

        String currentURL = driver.getCurrentUrl();

        Thread.sleep(1000);

        driver.navigate().refresh();

        String expectedTitle = driver.getTitle();


    }
}