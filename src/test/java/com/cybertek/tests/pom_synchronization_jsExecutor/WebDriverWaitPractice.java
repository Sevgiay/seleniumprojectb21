package com.cybertek.tests.pom_synchronization_jsExecutor;

import com.cybertek.pages.DynamicLoad7Page;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {
    //Cok onemli not "id" atribute yerine direk # isaretini calass icin de "." isaretini aramada kullanabiliriz

    @Test
    public void dynamic_load_7(){
        //Go to link
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        //2.Wait until title is "Dynamic title"

        //#1Create WebDriverWait instance
        //WebDriverWait --->
       // -This class is used to wait for EXPLICIT CONDITION.This will wait until title is "something" upto 10 (provided) seconds
        //If contition does not happen , it will throw TimeOutExeption
        //EX: -titleIs, -titleContains, title notlarda geri kalani var
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

        //#2 Create explicit wait condition . Create expected condition on title
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();


        //3.Assert : Message "Done" is displayed
        Assert.assertTrue(dynamicLoad7Page.infoMessage.isDisplayed());


        //4.Assert: Image is displayed. Note:Follow POM
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());

        //Note:Follow POM



    }
}
