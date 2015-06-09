package com.javarush.test.level06.lesson11.bonus02;

/**
 * Created by Users on 09.06.15.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String motherName = reader.readLine();
        String fatherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();
        String gmName = reader.readLine();
        Cat catGMother = new Cat(gmName);
        String gfName = reader.readLine();
        Cat catGFather = new Cat(gfName);
        Cat catMother = new Cat(motherName, null, catGMother);
        Cat catFather = new Cat(fatherName, catGFather, null);
        Cat catSon = new Cat(sonName, catFather, catMother);
        Cat catDaughter = new Cat(daughterName, catFather, catMother);
        System.out.println(catGFather);
        System.out.println(catGMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }
    public static class Cat{
        private String name;
        private Cat father = null;
        private Cat mother = null;
        Cat(String name){
            this.name = name;
        }
        Cat(String name, Cat father, Cat mother){
            this.name = name;
            this.father = father;
            this.mother = mother;
        }
        @Override
        public String toString(){
            String result="Cat name is " + name;
            if (mother==null) result+=", no mother";
            else result+=", mother is " +mother.name;
            if (father==null) result+=", no father";
            else result+=", father is "+ father.name;
            return result;
        }
    }
}
