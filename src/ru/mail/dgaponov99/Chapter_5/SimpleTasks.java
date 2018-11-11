package ru.mail.dgaponov99.Chapter_5;

public class SimpleTasks {

    private static void testWhatAboutString() {
        WhatAboutString whatAboutString = new WhatAboutString();
        System.out.println(whatAboutString.string);
    }

    private static void testGreetingClass() {
        System.out.println("Without message:");
        GreetingClass greetingClass = new GreetingClass();
        System.out.println();
        System.out.println("With message:");
        GreetingClass greetingClass1 = new GreetingClass("I'm Dima!");
    }


    private static void testWhatAboutThis() {
        WhatAboutThis whatAboutThis = new WhatAboutThis();
        whatAboutThis.printMessage();
    }

    private static void testDog() {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1, 'c');
        dog.bark('c', 1);
    }

    private static void testInitialisationString() {
        InitialisationString initialisationString = new InitialisationString();
        initialisationString.print();
    }

    public static void main(String[] args) {
        testInitialisationString();
    }
}

class WhatAboutString {
    String string;
}

class GreetingClass {
    public GreetingClass() {
        System.out.println("Hello, World!");
    }

    public GreetingClass(String message) {
        this();
        System.out.println(message);
    }
}

class Dog {
    public void bark() {
        System.out.println("Гав-гав");
    }

    public void bark(int i, char c) {
        System.out.println("Ууууууууууу.....");
    }

    public void bark(char c, int i) {
        System.out.println("У... У... Уууу...");
    }
}

class WhatAboutThis {
    public void message() {
        System.out.println("Hello!");
    }

    public void printMessage() {
        message();
        this.message();
    }
}

class InitialisationString {
    String string;
    {
        System.out.println("Initialisation block");
        string = "Hello!";
    }

    public void print() {
        System.out.println(string);
    }
}
