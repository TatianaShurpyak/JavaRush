package com.javarush.test.level08.lesson11.home09;

import java.util.Date;


/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала
года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static boolean isDateOdd(String date) {

        int dayCount = 0;

            Date newDate = new Date(date);
            Date yearStartTime = new Date(date);
            yearStartTime.setHours(0);
            yearStartTime.setMinutes(0);
            yearStartTime.setSeconds(0);
            yearStartTime.setDate(1);
            yearStartTime.setMonth(0);

            long msTimeDistance = newDate.getTime() - yearStartTime.getTime();
            long msDay = 24*60*60*1000;

            dayCount = (int)(msTimeDistance/msDay);

        return (dayCount %2 == 0);
    }
}
