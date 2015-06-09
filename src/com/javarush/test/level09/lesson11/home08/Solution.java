package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0
соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list1 = new ArrayList<int[]>();

        int[] ar1 ={4, 6, 34, 76, 44};
        int[] ar2 = {5,6};
        int[] ar3 = {4, 7, 4, -3};
        int[] ar4 = {65, 34, 9, 0, 34, 3, 6};
        int[] ar5 = {};

        list1.add(ar1);
        list1.add(ar2);
        list1.add(ar3);
        list1.add(ar4);
        list1.add(ar5);

        return list1;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
