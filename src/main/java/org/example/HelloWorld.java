package org.example;

import java.time.LocalDate;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hooray my first java app");
        String brand = "Amigoscode";
        Date date = new Date();
        //Primitive Data Types
        byte myByte = -128;
        short myShort = 32_000;
        int myInteger = 787878787;
        long myLongNum = 78787878787L;
        float pi = 3.14F;
        double doublePi = 3.1415;
        boolean isAdult = true;
        char name = 'A';
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInteger);
        System.out.println(myLongNum);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(isAdult);
        System.out.println(name);

        //Non-primitive Data Types
        String myName = "Krishnan";
        System.out.println(myName.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());


    }
}