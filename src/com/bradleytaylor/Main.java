package com.bradleytaylor;

public class Main {

    public static void main(String[] args) {

        String gender = "PREFER not TO say";

        switch (gender.toLowerCase()) {
            case ("female") :
                System.out.println("Female");
                break;
            case ("male") :
                System.out.println("Male");
                break;
            case ("prefer not to say"):
                System.out.println("Prefer not to say");
                break;
            default :
                System.out.println("Gender unknown");
        }

    }
}
