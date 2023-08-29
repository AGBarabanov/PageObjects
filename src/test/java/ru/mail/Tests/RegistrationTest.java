package ru.mail.Tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.focused;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationTest {
    @BeforeAll
    public static void setUp() {
        Configuration.browser = "firefox";
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl="https://account.mail.ru";
    }

    @Test
    void fillRegistrationForm(){
        open("/signup");

        $("#fname").setValue("Anton");
        $("[data-test-id = last-name]").setValue("Barabanov"); // Поиск по test-id
        $("[data-test-id = birth-date__day").click();
        $("[data-test-id=select-menu-wrapper]").find(byText("21")).click();
        $("[data-test-id = birth-date__month").click();
        $("[data-test-id=select-menu-wrapper]").find(byText("Июль")).click();
        $("[data-test-id = birth-date__year").click();
        $("[data-test-id=select-menu-wrapper]").find(byText("1995")).click();
        $("[data-test-id = gender-form-field-inner]").find(byText("Мужской")).click();


    }




}
