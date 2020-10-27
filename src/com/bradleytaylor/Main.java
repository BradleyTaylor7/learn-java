package com.bradleytaylor;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " and b = " + b);

        Person Bradley = new Person("Bradley");
        Person Taylor = Bradley;

        System.out.println("Before");
        System.out.println(Bradley.name + " " +Taylor.name);

        Bradley.name = "Brad";

        System.out.println("After");
        System.out.println(Bradley.name + " " +Taylor.name);
    }

    static class Person {

        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
