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
            birthDateYear = $("[data-test-id = birth-date__year"),
            genderRadiobutton = $("[data-test-id = gender-form-field-inner]"),
            emailInput = $("[data-test-id = account__input]"),
            domenDropdown = $("[data-test-id = account__select]"),
            passwordInput = $("[data-test-id = password-input]"),
            passwordInputConfirm = $("[data-test-id = password-confirm-input]"),
            phoneNumberInput = $("[data-test-id = phone-input]");

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

    public void setGender(String value){
        genderRadiobutton.find(byText(value)).click();
    }

    public void setEmail(String valueName, String valueDomen){
        emailInput.setValue(valueName);
        domenDropdown.click();
        selectMenuWrapper.find(byText(valueDomen)).click();
    }

    public void setPassword(String value){
        passwordInput.setValue(value);
    }

    public void setPasswordConfirm(String value){
        passwordInputConfirm.setValue(value);
    }

    public void setPhoneNumber(String value){
        phoneNumberInput.setValue(value);
    }
}
