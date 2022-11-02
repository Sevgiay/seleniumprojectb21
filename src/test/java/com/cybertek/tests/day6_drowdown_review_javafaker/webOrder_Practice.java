package com.cybertek.tests.day6_drowdown_review_javafaker;

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

import java.util.List;
import java.util.concurrent.TimeUnit;

public class webOrder_Practice {

    WebDriver driver;


    @BeforeMethod
    public void setupMethod() {
        //Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");

        //Go to link
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //maximize
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        WebOrder_Utils.loginToSmartBear(driver);

    }
    @Test
    public void test2_create_order_with_java_faker() throws InterruptedException {
        //6.Click on Order
        WebElement orderLink = driver.findElement(By.linkText("Order"));
        orderLink.click();

        //7.Select familyAlbum from product, set quantity to 2

        //Locating the dropdown
        Select productDropdown = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));

        //Selecting "FamiltAlbum" from options using selectByVisibleText method
        productDropdown.selectByVisibleText("FamilyAlbum");

        //Locate quantityInput box
        WebElement inputQuantity = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));

        //inputQuantity.clear();
        Thread.sleep(1000);
        inputQuantity.sendKeys(Keys.BACK_SPACE);

        Thread.sleep(1000);
        inputQuantity.sendKeys("2");

        //8.Click to "Calculate" button
        WebElement calculateButton = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

        //locating web elements using ID locator
        WebElement nameinput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
        WebElement stritInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
        WebElement cityAdress = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
        WebElement zipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));


        //9.Fill address Info with JavaFaker
        Faker faker = new Faker();

        nameinput.sendKeys(faker.name().fullName());
        stritInput.sendKeys(faker.address().streetAddress());
        cityAdress.sendKeys(faker.address().city());
        zipCode.sendKeys(faker.address().zipCode());

        zipCode.sendKeys(faker.address().zipCode().replaceAll("-",""));

        //Generate: name,street , city, state , zip code
        //10..Click on"visa" radia button
        WebElement visaRadioButton = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
        visaRadioButton.click();

        //11.Generate card number using JavaFaker
        WebElement inputCreditCard = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
        inputCreditCard.sendKeys(faker.finance().creditCard());

        //Enter expration date
        WebElement inputExpirationDate = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1"));
        inputExpirationDate.sendKeys("01/26");

        //12.Click on "Process"
        WebElement processButton = driver.findElement(By.linkText("Process"));
        processButton.click();

        //13.Verify success message "New order has been successfully added.
    }


    @Test
    public void test1_link_verification(){


        //6.Print out count of the links on landing page
        List<WebElement>allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("Nummber of all links in this page : "+allLinks.size());

        //7.Print out each link on this page
        for (WebElement each : allLinks){
            System.out.println("eachLinks = "+each.getText());
        }
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException{
        Thread.sleep(1000);
    }
}