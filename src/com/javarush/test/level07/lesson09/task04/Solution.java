package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("карл"); //2
        list.add("варенье"); //2
        list.add("классика"); //2
        list.add("кириллица"); //2
        list.add("квас"); //2
        list.add("гвоздь"); //2

        list = fix(list);

        for (String s : list)
        {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i =0; i < list.size(); i++)
        {
            int len = list.get(i).length();
            char[] charArray = new char[len];
            int n = 0;
            int m = 0;
            for (int j = 0; j < len; j++)
            {
                charArray[j] = list.get(i).charAt(j);
                if (charArray[j] == 'р') n++;
                if (charArray[j] == 'л') m++;
            }
            if (n != 0 && m == 0)
            {
                list.remove(i);
                i--;
            }
            if (n == 0 && m != 0)
            {
                list.add(i,list.get(i));
                i++;
            }
        }
        return list;
    }
}