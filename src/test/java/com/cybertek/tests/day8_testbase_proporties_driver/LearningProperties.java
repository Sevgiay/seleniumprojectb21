package com.cybertek.tests.day8_testbase_proporties_driver;

import org.testng.annotations.Test;

public class LearningProperties {
    /*
    PROPERTIES Type:
- Java is keeping track of some of the important properties of your computer.
- There is a class in java, that handles "properties"
- Properties are stored as key and value format
key=value
browser=chrome
username=test
password=tester
env=qa1.google.com
- Different types of files: .txt, .ext, .pdf, .zip, .jpeg, .html , .xml, .java
- Type of this file will be .properties
- We will store our important test data in a key&value format (key=value)
WHATS SPECIAL ABOUT PROPERTIES TYPE OF FILE?
- IT STORES INFORMATION IN KEY=VALUE FORMAT.
test.properties
testdata.properties
configuration.properties

#1- Create object of Properties class.
Properties properties = new Properties();
#2- Use FileInputStream to open the file.
FileInputStream file = new FileInputStream(PATH);
#3- Load the opened file into properties object.
properties.load(file);
#4- Then we can use properties object to get the value of given key
properties.getProperty(keyWord);
key=value
browser=chrome
username=test
password=tester
url=qa1.google.com
properties.getProperty(browser); --> chrome
properties.getProperty(username); --> test
properties.getProperty(password); --> tester
properties.getProperty(url); --> qa1.google.com
We are going to be creating Driver utils with Singleton Design Pattern
     */

    @Test
    public void java_properties_reading_test(){
        System.out.println("System.getProperties(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));


    }
}
