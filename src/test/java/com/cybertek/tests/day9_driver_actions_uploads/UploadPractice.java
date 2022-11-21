package com.cybertek.tests.day9_driver_actions_uploads;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {
    //we don't have to have setUp method anymore  UNLESS we want to create additional structure for our tests
   // @BeforeMethod
  //  public void setUpMethod(){
  //      Driver.getDriver().get("http://practice.cybertekschool.com/upload");
  //  }

    @Test
    public void upload_test(){
        //Go to link
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        //Find any file that is not too big in size  and get the path of the file
        String path ="C:\\Users\\fztse\\Desktop\\download (1).png";
       //right click -> properties ->securty->object name(copy)

        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        BrowserUtils.sleep(2);

        chooseFile.sendKeys(path);

        uploadButton.click();

        //Locating the 'File uploaded' to upload the file
        WebElement fileUploadMessage = Driver.getDriver().findElement(By.tagName("h3"));

        //Assert the message is displayed
        Assert.assertTrue(fileUploadMessage.isDisplayed());

        //Closing the driver
        Driver.closeDriver();// This will set the driver value to null so that in the future when we use
                            //Driver.getDriver() it will be able to create new driver and continue with no issues


    }

    //Find some small file
}
