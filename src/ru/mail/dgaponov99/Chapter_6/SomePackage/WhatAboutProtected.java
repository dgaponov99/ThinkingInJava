package ru.mail.dgaponov99.Chapter_6.SomePackage;

public class WhatAboutProtected {

    protected static void protectedHello() {
        System.out.println("Hello world");
    }

    public static void publicHello() {
        System.out.println("Hello World");
    }

    static void hello() {
        System.out.println("Hello world!");
    }
    private static void privateHello() {
        System.out.println("Hello, world!");
    }
}
