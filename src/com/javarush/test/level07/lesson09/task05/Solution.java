package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        //read strings and init ArrayList list here - считать строки с консоли и объявить ArrayList list тут
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> initialist= new ArrayList<String>();

        for (int i =0; i <10; i++)
        {
            initialist.add(scanner.nextLine());
        }

        ArrayList<String> result = doubleValues(initialist);

        for (int i=0; i < result.size(); i++)
        {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i +=2)
        {
            list.add(i+1,list.get(i));
        }

        return list;
    }
}
