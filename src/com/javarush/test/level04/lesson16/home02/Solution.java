package com.javarush.test.level04.lesson16.home02;

import java.util.Scanner;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int  m1, m2, m3;

        if (n1 <=n2 && n1 <=n3) {
            m1 = n1;
            if (n2 <= n3) {
                m2 = n2;
                m3 = n3;
            }
            else {
                m2 = n3;
                m3 = n2;
            }

        }
        else if (n2 <=n3) {
            m1 = n2;
            if (n1 <=n3) {
                m2 = n1;
                m3 = n3;
            }
            else {
                m2 = n3;
                m3 = n1;
            }
        }
        else {
            m1 = n3;
            if (n1 <= n2) {
                m2 = n1;
                m3 = n2;
            }
            else {
                m2 = n2;
                m3 = n1;
            }
        }
        System.out.println(m2);
    }
}