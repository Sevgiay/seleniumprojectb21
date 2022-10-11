package com.cybertek.tests.day2_locators_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_SmartLoginVertification {
    public static void main(String[] args) {

        //Open a chrome browser
        //setup
        WebDriverManager.chromedriver().setup();

        //open browser
        WebDriver driver = new ChromeDriver();

        //maximize
        driver.manage().window().maximize();

        //2-Go to :
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/Login.aspx");

        //3- Verify title equals:
        //Expected: Web Orders Login

        String expectedTitle = "Web Orders Login";

        //when you use a method, you can press alt+enter to introduce local variable
        //it will automatically create variable and guess name for it
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Landing page title verification PASSED!");
        }else {
            System.out.println("Landing page title verificatioon FAILEDD!!");
            System.out.println("expectedTitle = "+expectedTitle);
            System.out.println("actualTitle  = "+ actualTitle);
        }

        //4-Enter username :Tester
        //first we need to locate the username input box and then sendKeys(userName) to it
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");

        //5-Enter password :Test
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");


        //6-Click "Sign In" button
        driver.findElement(By.className("button")).click();


        //7-Verify title equals:
        //Expected :Web Orders
        String expectedLoginTitle = "Web Orders";
        String actualLoginTitle = driver.getTitle();

        if (actualLoginTitle.equals(expectedLoginTitle)){
            System.out.println("Login title verification Passed!");
        }else {
            System.out.println("Landing  title verification FAILEDD!!");
            System.out.println("expectedLoginTitle = "+expectedTitle);
            System.out.println("actualLoginTitle  = "+ actualTitle);
        }

        driver.close();
    }
}

/*
COK ONEMLI

.getText();
  - This method gets the text of the given web element
  -This methid the TEX that is  in beetween the openin tag and closing tag
  -Return type is String.Retuns the text of the located web element as a String
 -It does Not accept any argument.

    <a href ="https://www.gmail.com">GMAIL</a>

     > Tag Name / the type of web element : <a>
     > Attribute Name : href
     > Attribute value : htpps://www.gmail.com
     > The text of this Web Element : GMAIL

     syntax = driver.findElement(By.id("jkl9")).getText();
     ---> this returns : CLICK HERE TO GO GMAIL

     ----------------------------------------------------------------------------

     COK ONEMLIIII

     .getAttribute("attribute");
         -This web element returns us the value of given attribute in the located web element
         -This method very similar to getText method

     #1 = driver.findElement(By.LinkText("CLICK HERE TO GO GMAIL")).getAttribute("name")--->abt9
     #2 = driver.findElement(By.LinkText("CLICK HERE TO GO GMAIL")).getAttribute("id")--->jkl9
     #3 = driver.findElement(By.LinkText("CLICK HERE TO GO GMAIL")).getAttribute("class")--->tt5
     #4 = driver.findElement(By.LinkText("CLICK HERE TO GO GMAIL")).getAttribute("href")--->
                                                                         --->https://www.gmail.com

  ---------->
     getText and getAttribute methods essentially only allows us to get some type of text from a located web elementh
     -getText() : if we want to get a text from in beetween opening tag and closingtag
     -getAttribute("attribute") : if we want to get an attribute value , we use this method
 */
/*
What is maven :
Build automation tool for creating java project

What is a "BUILD"?
Repeated steps we are doing when creating a java project : such as creating folder structure , compiling , deploying

Is Maven the only build aotomation tool far java project?
-ant , gradle

.findElement


 */
