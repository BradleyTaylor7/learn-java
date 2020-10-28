package com.bradleytaylor;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String [] name = {"Bradley", "Taylor"};

        // 1 line to create an array and add values
        int [] numbers = {1, 2};

        // longer way to create an array and add values
        int [] numbersOther = new int[2];

        numbersOther[0] = 1;
        numbersOther[1] = 2;

        System.out.println(Arrays.toString(name));
        System.out.println(name.length);
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbersOther));
        System.out.println(numbersOther.length);

    }
}
