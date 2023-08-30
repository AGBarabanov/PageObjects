package ru.mail.Tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.mail.Pages.RegistrationPage;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationTest {
    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    public static void setUp() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl="https://account.mail.ru";
    }

    @Test
    void fillRegistrationForm(){

        registrationPage.openPage();

        registrationPage.setFirstName("Anton");
        registrationPage.setLastName("Barabanov");
        registrationPage.setBirthDateDay("21");
        registrationPage.setBirthDateMonth("Июль");
        registrationPage.setBirthDateYear("1995");


        $("[data-test-id = gender-form-field-inner]").find(byText("Мужской")).click();
        $("[data-test-id = account__input]").setValue("antonanton2171995");
        $("[data-test-id = account__select]").click();
        $("[data-test-id = select-menu-wrapper]").find(byText("@internet.ru")).click();
        $("[data-test-id = password-input]").setValue("r4q1e3W2!12199");
        $("[data-test-id = password-confirm-input]").setValue("r4q1e3W2!12199");
        $("[data-test-id = phone-input]").setValue("79271927399");
    }




}
