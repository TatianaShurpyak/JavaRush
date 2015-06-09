package com.javarush.test.level09.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Задача по алгоритмам
Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
Пример ввода:
Вишня
1
Боб
3
Яблоко
2
0
Арбуз
Пример вывода:
Арбуз
3
Боб
2
Вишня
1
0
Яблоко
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(String[] array)
    {
        // checking who is who and copy to 2 arrays accordingly

        boolean[] isNum = new boolean[array.length];

        ArrayList<String> strings = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i=0; i < array.length; i++)
        {
            if (isNumber(array[i])) {
                isNum[i] = true;
                numbers.add(Integer.parseInt(array[i]));
            }
            else
            {
                isNum[i] = false;
                strings.add(array[i]);
            }
        }

        String[] arrayStrings = strings.toArray(new String[strings.size()]);
        Integer[] arrayNumbers = numbers.toArray(new Integer[numbers.size()]);


            // sorting strings asc
            for (int a = 0; a < arrayStrings.length; a ++) {
                for (int b = 0; b < arrayStrings.length - a - 1; b++) {
                    if (isGreaterThen(arrayStrings[b], arrayStrings[b+1])) {
                        String temp = arrayStrings[b+1];
                        arrayStrings[b+1] = arrayStrings[b];
                        arrayStrings[b] = temp;
                    }
                }
            }

            //sorting numbers desc

            for (int a = 0; a < arrayNumbers.length; a ++) {

                for (int b = 0; b < arrayNumbers.length - a - 1; b++) {
                    if (arrayNumbers[b] < arrayNumbers[b+1]) {
                        int temp = arrayNumbers[b+1];
                        arrayNumbers[b+1] = arrayNumbers[b];
                        arrayNumbers[b] = temp;
                    }
                }
            }

        // copying back to original array

        int k = 0;
        int j = 0;

        for (int i = 0; i< array.length; i++) {
            if (isNum[i]) {
                String temp = Integer.toString(arrayNumbers[j]);
                array[i] = temp;
                j++;
            }
            else {
                array[i] = arrayStrings[k];
                k++;
            }
        }

    }

    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThen(String a, String b)
    {
        return a.compareTo(b) > 0;
    }


    //строка - это на самом деле число?
    public static boolean isNumber(String s)
    {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++)
        {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
