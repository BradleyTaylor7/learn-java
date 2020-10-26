package com.bradleytaylor;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        String name = new String("Bradley Taylor");
        LocalDate today = LocalDate.now();
        System.out.println(name.toUpperCase());
        System.out.println(today.getYear());

    }
}
