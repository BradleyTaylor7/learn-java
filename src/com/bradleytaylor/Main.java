package com.bradleytaylor;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {20, 14, 39, 42, 18};
        String[] names = {"Bradley", "Taylor"};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // enhanced for loop
        System.out.println("\nEnhanced for loop");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.printf("%n");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
