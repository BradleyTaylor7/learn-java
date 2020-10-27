package com.bradleytaylor;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String name = new String("Bradley Taylor");

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(8));
        System.out.println(name.contains("Brad"));

        String brad = new String("Brad");
        System.out.println(name.contains(brad));

        System.out.println(name.equals(brad));
    }
}
