package tests;

import org.junit.jupiter.api.Test;

public class RegistrationDataTest extends TestBase{

    @Test
    void RegistrationFormTestFaker() {

        registrationPage.openPage();

        registrationPage.setFirstName(dataFakerTest.userName);
        registrationPage.setLastName(dataFakerTest.lastName);
        registrationPage.setEmail(dataFakerTest.userEmail);
        registrationPage.setGender(dataFakerTest.userGender);
        registrationPage.setUserPhone(dataFakerTest.userPhone);
        registrationPage.setBirthDate(dataFakerTest.userDayBirth, dataFakerTest.userMonthBirth, dataFakerTest.userYearBirth);
        registrationPage.setSubjects(dataFakerTest.userSubjects);
        registrationPage.setHobbies(dataFakerTest.userHobbies);
        registrationPage.setPicture(dataFakerTest.userPicture);
        registrationPage.setAddress(dataFakerTest.currentAddress);
        registrationPage.setState(dataFakerTest.userState);
        registrationPage.setCity(dataFakerTest.userCity);
        registrationPage.setButton(dataFakerTest.button);
        registrationPage.setModalDialog(dataFakerTest.modalDialog);

        registrationPage.resultDataComparisonAppears();
        registrationPage.resultDataComparison("Student Name",dataFakerTest.userName + " " + dataFakerTest.lastName);
        registrationPage.resultDataComparison("Student Email", dataFakerTest.userEmail);
        registrationPage.resultDataComparison("Gender", dataFakerTest.userGender);
        registrationPage.resultDataComparison("Mobile", dataFakerTest.userPhone);
        registrationPage.resultDataComparison("Date of Birth", dataFakerTest.userDayBirth + " " + dataFakerTest.userMonthBirth + "," + dataFakerTest.userYearBirth);
        registrationPage.resultDataComparison("Subjects", dataFakerTest.userSubjects);
        registrationPage.resultDataComparison("Hobbies", dataFakerTest.userHobbies);
        registrationPage.resultDataComparison("Address", dataFakerTest.currentAddress);
        registrationPage.resultDataComparison("State and City", dataFakerTest.userState + " " + dataFakerTest.userCity);

    }
}

