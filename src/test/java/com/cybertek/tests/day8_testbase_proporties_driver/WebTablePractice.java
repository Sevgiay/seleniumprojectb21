package com.cybertek.tests.day8_testbase_proporties_driver;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebOrder_Utils;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WebTablePractice extends TestBase {


    @Test
    public void verify_order_test() throws InterruptedException, IOException {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/login/");


            //#1 - Create Properties class object
            Properties properties = new Properties();

            //#2 - Open the file in JVM Memorry and pass the path of file
            String path= "configuration.properties";

            //For windows > copy path >copy path from content root

            FileInputStream file = new FileInputStream(path);

            //#3- Load the opened file into the Properties object

            properties.load(file);

           String url = properties.getProperty("webOrderUrl");

        WebOrder_Utils.loginToSmartBear(driver);

        ///Th
       BrowserUtils.sleep(1);


        //Verify "Mark Smith" is in
        WebOrder_Utils.verifyOrder(driver,"Mark Smith");

    }

    //Method : VerifyOrder
    //Create a method named verifyOrder in SmartBearUtilities class
    //Method takes WebDriver object and String(name)
    //Method should verify if given name exist in orders
    //This Method shoulds simply accepst a name(String), and assert whether
    //given name is in the list or not
    //Create a new   TestNG test to test if the method is working as axpected
}
