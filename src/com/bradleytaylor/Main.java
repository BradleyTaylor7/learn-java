package com.bradleytaylor;

public class Main {

    public static void main(String[] args) {

        String[] names = {"Bradley", "William", "Taylor"};

        for (String name : names) {
            if (name.equals("Taylor")) {
                break;
            }
            System.out.println(name);
        }

        for (String name : names) {
            if (name.startsWith("B")) {
                continue;
            }
            System.out.println(name);
        }
    }
}
