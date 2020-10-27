package com.bradleytaylor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date = new Date();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(localDate);
        System.out.println(localDateTime);
    }
}
