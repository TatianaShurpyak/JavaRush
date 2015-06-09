package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        String m1 = " ";
        String m2 = " ";
        String m3 = " ";

        if (n1 <=n2 && n1 <=n3) {
            m1 = Integer.toString(n1);
            if (n2 <= n3) {
                m2 = Integer.toString(n2);
                m3 = Integer.toString(n3);
            }
            else {
                m2 = Integer.toString(n3);
                m3 = Integer.toString(n2);
            }

        }
            else if (n2 <=n3) {
            m1 = Integer.toString(n2);
            if (n1 <=n3) {
                m2 = Integer.toString(n1);
                m3 = Integer.toString(n3);
            }
            else {
                m2 = Integer.toString(n3);
                m3 = Integer.toString(n1);
            }
        }
            else {
            m1 = Integer.toString(n3);
            if (n1 <= n2) {
                m2 = Integer.toString(n1);
                m3 = Integer.toString(n2);
            }
            else {
                m2 = Integer.toString(n2);
                m3 = Integer.toString(n1);
            }
        }
    System.out.println(m3 + " " + m2 + " " + m1);
    }
}
