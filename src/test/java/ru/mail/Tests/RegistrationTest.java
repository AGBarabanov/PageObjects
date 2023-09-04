package ru.mail.Tests;

import org.junit.jupiter.api.Test;
import static ru.mail.Tests.TestData.*;



public class RegistrationTest extends TestBase{

    @Test
    void fillRegistrationForm(){

        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(lastName)
                /*
                Выделили календарь в отдельный компонент
                .setBirthDate("15", "Сентябрь", "2023")
                */
                .setBirthDateDay("21")
                .setBirthDateMonth("Июль")
                .setBirthDateYear("1995")
                .setGender("Мужской")
                .setEmail(userEmail, "@internet.ru")
                .setPassword(userPassword)
                .setPasswordConfirm(userPassword)
                .setPhoneNumber(userPhoneNumber);

        /*
        registrationPage.verifyResoltsModalAppear()
                .verifyResult("Student Name", "Anton Barabanov")
                .verifyResult("Student Email", "anton.barabanov@gmail.com");

        */
    }
}
