package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class RegistrationDataTest extends TestBase{

    Faker faker = new Faker(new Locale ("Es"));
    String userName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String userPhone = faker.phoneNumber().subscriberNumber(10);
    String currentAddress = faker.address().secondaryAddress();

    @Test
    void RegistrationFormTestFaker() {

        registrationPage.openPage();

        registrationPage.setFirstName(userName);
        registrationPage.setLastName(lastName);
        registrationPage.setEmail(userEmail);
        registrationPage.setGender("Male");
        registrationPage.setUserPhone(userPhone);
        registrationPage.setBirthDate("28","October", "1988");
        registrationPage.setSubjects("English");
        registrationPage.setHobbies("Sports");
        registrationPage.setPicture("src/test/resources/1.jpeg");
        registrationPage.setAddress(currentAddress);
        registrationPage.setState("Haryana");
        registrationPage.setCity("Karnal");
        registrationPage.setButton("Sumbit");
        registrationPage.setModalDialog("Thanks for submitting the form");

        registrationPage.resultDataComparisonAppears();
        registrationPage.resultDataComparison("Student Name",userName + " " + lastName);
        registrationPage.resultDataComparison("Student Email", userEmail);
        registrationPage.resultDataComparison("Gender", "Male");
        registrationPage.resultDataComparison("Mobile", userPhone);
        registrationPage.resultDataComparison("Date of Birth", "28 October,1988");
        registrationPage.resultDataComparison("Subjects", "English");
        registrationPage.resultDataComparison("Hobbies", "Sports");
        registrationPage.resultDataComparison("Address", currentAddress);
        registrationPage.resultDataComparison("State and City", "Haryana Karnal");

    }
}

