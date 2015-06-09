package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        HashSet<String> set = new HashSet<String>();

        set.add("Лира");
        set.add("Лом");
        set.add("Лоск");
        set.add("Лиана");
        set.add("Лупа");
        set.add("Лампа");
        set.add("Любовь");
        set.add("Ласка");
        set.add("Листик");
        set.add("Ландыш");
        set.add("Лак");
        set.add("Лидер");
        set.add("Лампочка");
        set.add("Лор");
        set.add("Лист");
        set.add("Лаборатория");
        set.add("Лабораторная");
        set.add("Лекарство");
        set.add("Лекарь");
        set.add("Лесничий");

        return set;

    }
}
