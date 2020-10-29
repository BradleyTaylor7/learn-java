package com.bradleytaylor;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = scan.nextLine();
        System.out.println("Hello " + name);

        System.out.println("What is your age?");

        int age = scan.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();

        System.out.println("You was born in " + year);

    }
}
