package com.javarush.test.level06.lesson11.bonus03;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();

        for (int i=0; i < 5; i++)
        {
            num.add(scanner.nextInt());
        }

        int min = num.get(0);
        int imin = 0;

        for (int j = 0; j < 5; j++)
        {
            min = num.get(0);
            imin = 0;
            for (int i = 1; i < num.size(); i++)
            {
                int temp = num.get(i);
                if (temp < min)
                {
                    min = temp;
                    imin = i;
                }
            }
            System.out.println(min);
            num.remove(imin);
        }

    }
}
