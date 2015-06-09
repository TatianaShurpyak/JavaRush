package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human child1 = new Human ("Child1", true, 4);
        Human child2 = new Human ("Child2", false, 10);
        Human child3 = new Human ("Child3", true, 16);

        ArrayList<Human> detiDadMum = new ArrayList<Human>();
        detiDadMum.add(child1);
        detiDadMum.add(child2);
        detiDadMum.add(child3);

        Human dad = new Human ("Dad", true, 39, detiDadMum);
        Human mum = new Human ("Mum", false, 37, detiDadMum);

        ArrayList<Human> detiDed1Bab1 = new ArrayList<Human>();
        detiDed1Bab1.add(dad);

        Human ded1 = new Human ("Ded1", true, 87, detiDed1Bab1);
        Human bab1 = new Human ("Bab1", false, 85, detiDed1Bab1);

        ArrayList<Human> detiDed2Bab2 = new ArrayList<Human>();
        detiDed2Bab2.add(mum);

        Human ded2 = new Human ("Ded2", true, 89, detiDed2Bab2);
        Human bab2 = new Human ("Bab2", false, 87, detiDed2Bab2);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(dad);
        System.out.println(mum);
        System.out.println(ded2);
        System.out.println(ded1);
        System.out.println(bab1);
        System.out.println(bab2);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> childs) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children.addAll(childs);
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
