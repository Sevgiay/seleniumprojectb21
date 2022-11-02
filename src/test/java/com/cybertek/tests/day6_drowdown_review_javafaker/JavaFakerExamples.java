package com.cybertek.tests.day6_drowdown_review_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {

    @Test
    public void java_faker_test1(){
        //we need to create an object of the JavaFaker
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        System.out.println("firstName = "+firstName);

        String lastName = faker.name().lastName();
        System.out.println("lastName = "+lastName);

        String fullName = faker.name().fullName();
        System.out.println("fullName = "+fullName);

        String  adress = faker.address().fullAddress();
        System.out.println("adress = " + adress);

        String gameOfThrones = faker.gameOfThrones().house();
        String gotQuote = faker.gameOfThrones().quote();

        System.out.println("gotQuote = " + gotQuote);
        System.out.println("gameOfThrones = " + gameOfThrones);

        String chuckNorrisFact = faker.chuckNorris().fact();
        System.out.println("chuckNorrisFact = " + chuckNorrisFact);

        String SSN  = faker.idNumber().ssnValid();
        System.out.println("SSN = " + SSN);
    }

}
