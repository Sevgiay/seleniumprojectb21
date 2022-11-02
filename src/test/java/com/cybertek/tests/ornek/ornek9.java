package com.cybertek.tests.ornek;

import com.cybertek.utilities.WebDriverFactory;
import com.cybertek.utilities.WebOrder_Utils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ornek9 {
   WebDriver driver;

   @BeforeMethod
    public void setUp(){

       driver = WebDriverFactory.getDriver("chrome");

       driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

       WebOrder_Utils.loginToSmartBear(driver);

   }
   @Test
   public void test2_create_order_with_java_faker() throws InterruptedException {

       WebElement orderLink = driver.findElement(By.linkText("Order"));
       orderLink.click();

       Select productDropdown = new Select(driver.findElement(By.name("ctl00$MainContent$fmwOrder$ddlProduct")));
       productDropdown.selectByVisibleText("FamilyAlbum");

       WebElement quantitybox = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));

       Thread.sleep(1000);
       quantitybox.sendKeys(Keys.BACK_SPACE);
       quantitybox.sendKeys("2");

       WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
       calculateButton.click();


       WebElement byname = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtName']"));
       WebElement bystreet = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox2']"));
       WebElement bycity = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox3']"));
       WebElement bystate = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox4']"));
       WebElement byzipcode = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox5']"));

       Faker faker = new Faker();
       byname.sendKeys(faker.name().fullName());
       bystreet.sendKeys(faker.address().streetAddress());
       bycity.sendKeys(faker.address().city());
       byzipcode.sendKeys(faker.address().zipCode());

       byzipcode.sendKeys(faker.address().zipCode().replaceAll("-",""));

       WebElement radiobutton = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_cardList_0']"));
       radiobutton.click();

       WebElement cardnumber = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
       cardnumber.sendKeys(faker.finance().creditCard());

       WebElement expirationNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
       expirationNumber.sendKeys("01/26");

       WebElement procces = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
       procces.click();


   }
    @AfterMethod
    public void tearDownMethod () throws InterruptedException {
       Thread.sleep(1000);
    }

}
