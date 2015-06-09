package com.javarush.test.level07.lesson04.task05;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину
во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       int[] num1 = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++)
        {
            num1[i] = scanner.nextInt();
        }
        int[] num2 = new int[10];
        int[] num3 = new int[10];

        for (int i = 0; i <20; i++)
        {
            if (i<10) {
                num2[i] = num1[i];
            }
            else
            {
                num3[i - 10] = num1[i];
                System.out.println(num3[i - 10]);
            }
        }
    }
}
