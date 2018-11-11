package ru.mail.dgaponov99.Chapter_3;

import static ru.mail.dgaponov99.util.Print.*;

public class WhatAboutSting {

    public static void compareString(String s1, String s2) {
        println("s1 == s2 is " + (s1 == s2));
        println("s1 equals s2 is " + s1.equals(s2));
    }

    public static void main(String[] args) {
        compareString("hello", "hello1");
        compareString("hello", "hello");
        String s1 = "hello";
        String s2 = "hello";
        compareString(s1, s2);
        String s11 = new String("Hello");
        String s22 = new String("Hello");
        compareString(s11, s22);
    }
}
