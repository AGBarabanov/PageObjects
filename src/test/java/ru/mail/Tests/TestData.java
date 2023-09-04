package ru.mail.Tests;

import com.github.javafaker.Faker;
import java.util.Locale;

public class TestData {
    static Faker faker = new Faker(new Locale("ru"));

    public static String userName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userPassword = faker.internet().password(9,20),
            userPhoneNumber = faker.phoneNumber().subscriberNumber(10);
}
