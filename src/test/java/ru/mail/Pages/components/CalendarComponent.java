package ru.mail.Pages.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    //Выбор даты в календаре
    public void setDate(String day, String month, String year){
        $(".react-datepicker__month-select").selectOptionByValue("6");
        $(".react-datepicker__year-select").selectOption("1995");
        $(".react-datepicker__day--0" + day + "\"").click();
    }
}
