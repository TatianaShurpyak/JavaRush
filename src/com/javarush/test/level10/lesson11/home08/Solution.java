package com.javarush.test.level10.lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк.
Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] listik = (ArrayList<String>[])new ArrayList[3];

        listik[0] = new ArrayList<String>();
        listik[0].add("Hello");
        listik[0].add("World");

        listik[1] = new ArrayList<String>();
        listik[1].add("Hello");
        listik[1].add("World");

        listik[2] = new ArrayList<String>();
        listik[2].add("Hello");
        listik[2].add("World");

        return listik;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}