package ru.mail.Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    private SelenideElement
            firstNameInput = $("#fname"),
            lastNameInput = $("[data-test-id = last-name]"),
            selectMenuWrapper = $("[data-test-id = select-menu-wrapper]"),
            birthDateDay = $("[data-test-id = birth-date__day"),
            birthDateMonth = $("[data-test-id = birth-date__month"),
            birthDateYear = $("[data-test-id = birth-date__year");

    public void openPage(){
        open("/signup");
    }

    public void setFirstName(String value){
        firstNameInput.setValue(value);
    }

    public void setLastName(String value){
        lastNameInput.setValue(value);
    }

    public void setBirthDateDay(String value){
        birthDateDay.click();
        selectMenuWrapper.find(byText(value)).click();
    }

    public void setBirthDateMonth(String value){
        birthDateMonth.click();
        selectMenuWrapper.find(byText(value)).click();
    }

    public void setBirthDateYear(String value){
        birthDateYear.click();
        selectMenuWrapper.find(byText(value)).click();
    }


}
