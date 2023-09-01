package ru.mail.Pages;

import com.codeborne.selenide.SelenideElement;
import ru.mail.Pages.components.CalendarComponent;
import ru.mail.Pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();

    private SelenideElement
            firstNameInput = $("#fname"),
            lastNameInput = $("#lname"),
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

    public RegistrationPage openPage(){
        open("/signup");

        return this;
    }

    public RegistrationPage setFirstName(String value){
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName(String value){
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDateDay(String value){
        birthDateDay.click();
        selectMenuWrapper.find(byText(value)).click();

        return this;
    }

    public RegistrationPage setBirthDateMonth(String value){
        birthDateMonth.click();
        selectMenuWrapper.find(byText(value)).click();

        return this;
    }

    public RegistrationPage setBirthDateYear(String value){
        birthDateYear.click();
        selectMenuWrapper.find(byText(value)).click();

        return this;
    }

    public RegistrationPage setGender(String value){
        genderRadiobutton.find(byText(value)).click();

        return this;
    }

    public RegistrationPage setEmail(String valueName, String valueDomen){
        emailInput.setValue(valueName);
        domenDropdown.click();
        selectMenuWrapper.find(byText(valueDomen)).click();

        return this;
    }

    public RegistrationPage setPassword(String value){
        passwordInput.setValue(value);

        return this;
    }

    public RegistrationPage setPasswordConfirm(String value){
        passwordInputConfirm.setValue(value);

        return this;
    }

    public RegistrationPage setPhoneNumber(String value){
        phoneNumberInput.setValue(value);

        return this;
    }

    public RegistrationPage setBirthDate(String day, String month, String year){
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistrationPage verifyResoltsModalAppear(){
        registrationResultsModal.verifyModalAppear();

        return this;
    }

    public RegistrationPage verifyResult(String key, String value){
        registrationResultsModal.verifyResult(key, value);

        return this;
    }
}
