package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        int[] temp = new int[5];


        for (int j =0; j <5; j++) {
            int max = array[0];
            int maxi = 0;

            for (int i =0; i < 20; i++) {
             if (array[i] > max) {
                max = array[i];
                maxi = i;
              }
            }

            temp[j] = max;
            array[maxi] = -2147483648;
        }

        for (int i=0; i<5; i++) {
            array[i] = temp[i];
        }
    }
}
