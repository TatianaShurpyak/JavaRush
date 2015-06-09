package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String,String>();

        map.put("Иванов","Петр");
        map.put("Смирнов","Василий");
        map.put("Кириллова","Василиса");
        map.put("Ульянова","Тамара");
        map.put("Примерова","Примерка");
        map.put("Кролева","Зайчиха");
        map.put("Лисина","Волчица");
        map.put("Истегаева","Пироженка");
        map.put("Устюгова","Снегурочка");
        map.put("Крот","Крольчиха");

        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int c=0;
       for (Map.Entry<String, String> pair: map.entrySet())
       {
           String value = pair.getValue();
           if (value.equals(name)) c++;
       }
        return c;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int b=0;
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            String key= pair.getKey();
            if (key.equals(familiya)) b++;
        }
        return b;

    }
}
