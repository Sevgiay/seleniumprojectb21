package com.cybertek.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {  // bu komut hatalari ortadan kaldiriyor sllep kirmizi oldugu icin bunu yazdik

        //1- Setup web driver manager
        WebDriverManager.chromedriver().setup();// cromu kurma methodu her clasta yazilmak zorunda
       // System.setProperty("chrome","path of driver");

     //   WebDriverManager.firefoxdriver().setup();
     //WebDriverManager.firefoxdriver().setup();


        //2-Create instance of web driver and use it to open page
        // this is the line where the Selenium WebDriver opens the Browser
        WebDriver driver = new ChromeDriver();

        //this line maximizes the browser.
        driver.manage().window().maximize();


        //3- Use the instance to get the URL we want
        driver.get("https://www.google.com");//

        System.out.println("Current title of the page: "+driver.getTitle());

        //getting the current URL and storing  it into
        String ccurretnURL = driver .getCurrentUrl();

        System.out.println("CurrentURL : "+ccurretnURL);

        //We are usinng navigate.back method from Selenium Library
        Thread.sleep(3000);

        //goes to back
        driver.navigate().back();

        Thread.sleep(3000);

        //goes to forward
        driver.navigate().forward();

        Thread.sleep(3000);

        //this the simmilar to get method .Its
        driver.navigate().to("https://www.tesla.com");

        System.out.println("Current title of the page: "+driver.getTitle());

        //we are refreshing or re-assigning the value of "currentUrl" String by calling the method again
        ccurretnURL = driver.getCurrentUrl();

        System.out.println("CurrentURL : "+ccurretnURL);

        //this line maximizes the browser.
        driver.manage().window().maximize();


        //closing the browser
        driver.close();
/*
What is selenium
    -Selenium is basically some jar files (library , clases , methods ) that allows us to automate browsers.


What does.get("URL") ; method do ?
    -The get method coming from selenium library will get the given URL in an opened.
    -It accepts a String argument and will use it as a URL to get the page.
    -This method does not return anything.(void)

What is maven ?
    - "BUILT AUTOMATION TOOL"
    - Maven is a built automation tool used primarily for Java Project
    - Maven helps us create and manage java project.
    - When we create a project with maven a few things happen:

    #1   - we get a pre configured project where there is already existing folder structure(yapi)
       - src
         -  main : is used by developers to write java application
         -  test : is used by developers to write UNIT tests for the sources code
         -  pom.xml :

    #2   - pom.xml : PROJECT OBJECT MODEL , pomxml
            - pom.xml file is the MOST important file in a maven project
            - we can change the versions , update the dependency versions from this file easly
            -this file allows us to add and manage dependencies into our project

    - We need to be aware of which version of which tool are using
         - selenium 3.141.59
         - java 8
         - webDriverManager 4.2.2

    -WHAT IS BUILT ?
        -Built is repeated steps when we are creating a java project

    -What are those repeated steps
        - create a folder structure
        - add libraries , jar files (whatever libraries you need)
        - deploy


 ---> All of the steps we write above combined together are called a "BUILD"

 --> Is Maven for testers ?
    -NO.
    -But as SDETS we will use its advance functionalities for test automation purposes.

  ---> Is selenium for tester
    -YES.

  --->Difference between maven and selenium?
    -Maven is the tool that we use to create the JAVA PROJECT ITSELF

        ->selenium project name(muhtar's class) :javaprogrammingprojectb21
            - java

        -> java project name :seleniumprojectb21
            - java( maven project )
            -pom.xml(we can add dependencies easly)
               -add selenium
               -add webdrivermaneger

    -Java libraries (jar files) for using as programing language
    - Selenium is just some libraries we add to the project to be able to automate browser




        public class JavaClass{
           public static void main (String [] args){
              /some java code here
           }
     }
 */
    }
}
