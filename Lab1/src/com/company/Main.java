package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
    /*
    Задание
•	Напишите программу, выводящую в консоль календарь на текущий год
•	Дополнительно: первый день недели должен указываться через параметр командной строки
     */
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.getInstance();
        calendar.getCalendarType();
        for(int i = 0; i<12;i++)
        {
            System.out.println(calendar.MONTH+i);
        }




        System.out.println("SUNDAY\tMONDAY\tTUESDAY\tWEDNESDAY\tTHURSDAY\tFRIDAY\tSATURDAY");
        System.out.println("Месяц: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Месяц: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Порядковый номер недели в месяце: " + calendar.get(Calendar.WEEK_OF_MONTH));//порядковый номер недели в месяце

        System.out.println("Число: " + calendar.get(Calendar.DAY_OF_MONTH));




    }
}
