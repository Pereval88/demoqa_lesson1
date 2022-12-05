package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.CalendarComponent;
import pages.components.DataComparisonComponent;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    DataComparisonComponent dataComparisonComponent =   new DataComparisonComponent();

    private final String
            TITLE_TEXT = "Student Registration Form";

    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            userPhoneInput = $("#userNumber");

    public void openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
    }

    public void setFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public void setLastName(String value) {
        lastNameInput.setValue(value);
    }

    public void setEmail(String value) {
        emailInput.setValue(value);
    }

    public void setGender(String value) {
        $("#genterWrapper").$(byText(value)).click();
    }

    public void setUserPhone(String value) {
        userPhoneInput.setValue(value);
    }

    public void setBirthDate(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);
    }

    public void setSubjects(String value) {
        $("#subjectsInput").setValue(value);
        $(".subjects-auto-complete__menu").$(byText(value)).click();
    }

    public void setHobbies(String value) {
        $("#hobbiesWrapper").$(byText(value)).click();
    }

    public void setPicture(String value) {
        $("#uploadPicture").uploadFile(new File(value));
    }

    public void setAddress(String value) {
        $("#currentAddress").setValue(value);
    }

    public void setState(String value) {
        $("#state").click();
        $("#stateCity-wrapper").$(byText(value)).click();
    }

    public void setCity(String value) {
        $("#city").click();
        $("#stateCity-wrapper").$(byText(value)).click();
    }

    public void setButton(String value) {
        $("#submit").click();
    }

   public void setModalDialog(String value)  {
       $("#example-modal-sizes-title-lg")
               .shouldHave(text(value));
   }

    public void resultDataComparisonAppears()  {
        dataComparisonComponent.dataComparison();
    }

    public void resultDataComparison(String key, String value) {
        dataComparisonComponent.verifyDataComparison(key, value);
    }
}


