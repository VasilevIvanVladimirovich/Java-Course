package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/*
 Задание
•	Напишите программу, выводящую в консоль календарь на текущий год
•	Дополнительно: первый день недели должен указываться через параметр командной строки
  */
public class Main {

    public static void main(String[] args) {
        GregorianCalendar еxperimentalCalendar = new GregorianCalendar(); //Определеяем текущий год
        int todayYear = еxperimentalCalendar.get(Calendar.YEAR);
        String bufOtstup;
        String[] otstup = {"","\t","\t\t","\t\t\t","\t\t\t\t","\t\t\t\t\t","\t\t\t\t\t\t",""};
        String[] weekName = {"Пн","Вт","Ср","Чт","Пт","Сб","Вс"};
        String[] monthName = {"Январь","Февраль","Март","Апрель","Май","Июнь","Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        int[] dayInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
         if( еxperimentalCalendar.isLeapYear(todayYear))
        {
            dayInMonth[1] = 29;
        }
        for(int m = 0; m < 12;m++)
        {
            System.out.println("\n"+monthName[m]);
            System.out.print(weekName[0]+'\t'+weekName[1]+'\t'+weekName[2]+'\t'+weekName[3]+'\t'+weekName[4]+'\t'+weekName[5]+'\t'+weekName[6]);
            System.out.println();
            еxperimentalCalendar.set(todayYear,m,0);
            if(еxperimentalCalendar.get(Calendar.DAY_OF_WEEK)!=0)
            {
                bufOtstup=otstup[еxperimentalCalendar.get(Calendar.DAY_OF_WEEK)-1];
            }else bufOtstup=otstup[0];
                for(int d = 0; d < dayInMonth[m];d++)
                {
                   еxperimentalCalendar.set(todayYear,m,d);
                   System.out.print(bufOtstup + (d+1) + "\t");
                    bufOtstup=otstup[0];
                   if(еxperimentalCalendar.get(Calendar.DAY_OF_WEEK)==7)
                   {
                       System.out.println();
                   }
                }
        }

    }
}
