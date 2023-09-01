package ru.mail.Tests;

import org.junit.jupiter.api.Test;

public class RegistrationTest extends TestBase{

    @Test
    void fillRegistrationForm(){

        registrationPage.openPage()
                .setFirstName("Anton")
                .setLastName("Barabanov")
                /*
                Выделили календарь в отдельный компонент
                .setBirthDate("15", "Сентябрь", "2023")
                */
                .setBirthDateDay("21")
                .setBirthDateMonth("Июль")
                .setBirthDateYear("1995")
                .setGender("Мужской")
                .setEmail("antonanton2171995", "@internet.ru")
                .setPassword("r4q1e3W2!12199")
                .setPasswordConfirm("r4q1e3W2!12199")
                .setPhoneNumber("79271927399");

        registrationPage.verifyResoltsModalAppear()
                .verifyResult("Student Name", "Anton Barabanov")
                .verifyResult("Student Email", "anton.barabanov@gmail.com");
    }
}
