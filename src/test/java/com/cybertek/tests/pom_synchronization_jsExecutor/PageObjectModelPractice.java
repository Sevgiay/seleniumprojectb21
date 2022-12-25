package com.cybertek.tests.pom_synchronization_jsExecutor;

import com.cybertek.pages.LoginPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class PageObjectModelPractice {
    @Test
    public void login_to_smartBear(){

        String url = ConfigurationReader.getProperty("webOrderUrl");
        Driver.getDriver().get(url);
       // Driver.getDriver().get(ConfigurationReader.getProperty("webOrderUrl"));

        //When create object of this class , the object and driver instance will be
        //already initialized(recognize each other)
        LoginPage loginPage = new LoginPage();

        //We are allowed to use object of this class to reach web elements and use selenium methods


        //Sending username using object of loginPage and web element(that has been located in Login
        String username=ConfigurationReader.getProperty("usernameSmartBear");
        loginPage.inputUserName.sendKeys(username);


        String password = ConfigurationReader.getProperty("passwordSmartBear");
        loginPage.inputpassword.sendKeys(password);


        loginPage.loginButton.click();

    }
}
