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
        registrationPage.setGender("Мужской");
        registrationPage.setEmail("antonanton2171995", "@internet.ru");
        registrationPage.setPassword("r4q1e3W2!12199");
        registrationPage.setPasswordConfirm("r4q1e3W2!12199");
        registrationPage.setPhoneNumber("79271927399");
    }
}
