package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list= new ArrayList <String>();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i < 5; i++)
        {
            list.add(scanner.nextLine());
        }
        for (int i =0; i < list.size()/2; i++)
        {
            String temp = list.get(i);
            list.set(i,list.get(list.size()-i-1));
            list.set(list.size()-i-1, temp);
        }

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));;
        }
    }
}
