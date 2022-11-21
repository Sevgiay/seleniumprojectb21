package com.cybertek.tests.base;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {
    /*
    TESTBASE:
- TestBase is a class where we store common variables: setup, teardown steps etc.
- This class will be parent of all of your tests
- TestBase is not a utility class
- I will make it abstract class, because I don't want anyone to be able to create object of this class.
- We can only "extend" to this class
--------------------------------------------
     */

   public WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {

        //Open browser
        driver = WebDriverFactory.getDriver("chrome");

        //Go to website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
