package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        int id;
        String firstname;
        String lastname;
        int age;
        boolean married;
        boolean dead;

         Human() {};
         Human(String name) {
            this.firstname = name;
        }
         Human(int id, boolean married) {
            this.id = id;
            this.married = married;
        }
         Human(int id, String name, String lastname, int age, boolean married, boolean dead) {
            this.id = id;
            this.firstname = name;
            this.married = married;
            this.age = age;
            this.dead = dead;
            this.lastname = lastname;
        }
         Human(int id, String name, String lastname, int age, boolean married) {
            this.id = id;
            this.firstname = name;
            this.married = married;
            this.age = age;
            this.lastname = lastname;
        }
         Human(int id, String name, int age, boolean married, boolean dead) {
            this.id = id;
            this.firstname = name;
            this.married = married;
            this.age = age;
            this.dead = dead;
        }
         Human(int id, String name, String lastname) {
            this.id = id;
            this.firstname = name;
            this.lastname = lastname;
        }
         Human(int id, String name, String lastname, boolean married, boolean dead) {
            this.id = id;
            this.firstname = name;
            this.married = married;
            this.dead = dead;
            this.lastname = lastname;
        }
         Human(int id, String name, String lastname, int age) {
            this.id = id;
            this.firstname = name;
            this.age = age;
            this.lastname = lastname;
        }
         Human(int id, String name) {
            this.id = id;
            this.firstname = name;

        }

    }
}
