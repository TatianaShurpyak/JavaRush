package com.javarush.test.level08.lesson08.task05;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();

        map.put("Ivanov", "Vasiliy");
        map.put("Petrov", "Cristian");
        map.put("Smirnov", "Anatoly");
        map.put("Vasilyev", "Pavel");
        map.put("Schmidt", "Vasiliy");
        map.put("Avokadov", "George");
        map.put("Spears", "Britney");
        map.put("Ivanova", "Cristina");
        map.put("Karabashka", "Anatoly");
        map.put("Istinov", "Pavel");

        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy1 = new HashMap<String, String>(map);
        HashMap<String, String> copy2 = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy1.entrySet())
            {
                String value = pair.getValue();
                copy2.remove(pair.getKey());
                if (copy2.containsValue(value)) removeItemFromMapByValue(map, value);
            }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
