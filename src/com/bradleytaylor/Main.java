package com.bradleytaylor;

public class Main {

    public static void main(String[] args) {

        byte aByte = 127;
        short aShort = -32768;
        int aInt = 2147483647;
        long aLong = -9223372036854775808L;     // Add l or L at end for long

        float shortPi = 3.141592F;     // Add f or F at end for float
        double fullPi = 3.14159265359;

        boolean isTrue = true;
        boolean isFalse = false;

        char myInitial = 'B';

        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aInt);
        System.out.println(aLong);
        System.out.println(shortPi);
        System.out.println(fullPi);
        System.out.println(isTrue);
        System.out.println(isFalse);
        System.out.println(myInitial);

    }
}
