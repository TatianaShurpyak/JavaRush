package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Иванов", new Date("JULY 3 1981"));
        map.put("Кириллов", new Date("OCTOBER 1 1995"));
        map.put("Васин", new Date("FEBRUARY 1 1980"));
        map.put("Лагутенко", new Date("AUGUST 1 1980"));
        map.put("Сюткин", new Date("JUNE 1 1980"));
        map.put("Кобзон", new Date("SEPTEMBER 1 1980"));
        map.put("Киркоров", new Date("JANUARY 1 1975"));
        map.put("Билан", new Date("DECEMBER 1 1995"));
        map.put("Лазарев", new Date("JANUARY 1 1998"));

        //Напишите тут ваш код

        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> itr = map.entrySet().iterator();

        while (itr.hasNext())
        {
            Map.Entry <String, Date> pair = itr.next();
            Date value = pair.getValue();
            if (value.getMonth() >= 5 && value.getMonth() <= 7)
                itr.remove();

        }

    }
}
