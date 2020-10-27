package com.bradleytaylor;

public class Main {

    public static void main(String[] args) {

        int age = 22;

        if (age >= 20) {
            System.out.println("Adult");
        } else if (age >= 13 && age <= 19){
            System.out.println("Teenager");
        } else {
            System.out.println("Child");
        }

    }
}
