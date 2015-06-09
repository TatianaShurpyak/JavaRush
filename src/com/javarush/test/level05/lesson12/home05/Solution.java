package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма».
Вывести на экран полученную сумму.
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;

        while (!(input.equals("сумма")))
        {
            sum+= Integer.parseInt(input);
            input = scanner.nextLine();
        }
        System.out.println(sum);
    }
}
