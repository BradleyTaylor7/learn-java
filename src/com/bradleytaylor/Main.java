package com.bradleytaylor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        boolean isStudent = true;
        boolean isFullTime = false;
        boolean isPartTime = true;

        System.out.println(isStudent && isFullTime);
        System.out.println(isStudent || isFullTime);
        System.out.println((!isStudent && isFullTime) || !isPartTime);
    }
}
