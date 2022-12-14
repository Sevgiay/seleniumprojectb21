package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilsPractice {



    @Test
    public void simple_google_search_test(){

        //go to google.com
     //   WebDriverManager.chromedriver().setup();
    //    WebDriver driver = new ChromeDriver();
     //   driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //    driver.get("https://www.google.com");

        //Driver.getDriver() = driver
        String url = ConfigurationReader.getProperty("googleUrl");
        Driver.getDriver().get(url);

        //Search for a value
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));

        String seachValue  = ConfigurationReader.getProperty("searchValue");
        searchBox.sendKeys(seachValue+ Keys.ENTER);

        //Assert title contains the value
         String actualTitle = Driver.getDriver().getTitle();

         //expected --> comes from documentation
        String expectedInTitle = seachValue;

        //We are 2 seconds just want to wait for firefox to catch up
        BrowserUtils.sleep(2);
        System.out.println("actualTitle = " + actualTitle);
        System.out.println("expectedInTitle = " + expectedInTitle);

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        Driver.closeDriver();//etsy calisir

      //  Driver.getDriver().quit();//etsy hata verir calismaz

        Driver.getDriver().get("https://www.etsy.com");


    }
}
