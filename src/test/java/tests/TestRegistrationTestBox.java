package tests;


import org.junit.jupiter.api.Test;


public class TestRegistrationTestBox extends TestBase{

    @Test
    void RegistrationFormTest() {
        String userName = "Alex";
        String lastName = "Valov";
        String userEmail = "AlVal88@yandex.ru";
        String userPhone = "8800222353";

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
        registrationPage.setAddress("Moscow city, 1923 str.");
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
        registrationPage.resultDataComparison("Address", "Moscow city, 1923 str.");
        registrationPage.resultDataComparison("State and City", "Haryana Karnal");

     }
}