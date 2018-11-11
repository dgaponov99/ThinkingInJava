package ru.mail.dgaponov99.Chapter_5;

public class StaticString {
    public static void main(String[] args) {
        AnotherClass.print();
    }
}

class AnotherClass {
    private static String string1 = "Hello";
    private static String string2;
    static {
        string2 = "Hello, World!";
    }

    static void print() {
        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);
    }
}
