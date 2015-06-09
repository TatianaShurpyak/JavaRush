package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
         Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<String> list = new ArrayList<String>();

        for (int i =0; i < N ; i++)
        {
            list.add(scanner.next());
        }
        for (int i =0; i < M; i++)
        {
            String temp = list.get(0);
            list.remove(0);
            list.add(temp);
        }
        for (int i =0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
