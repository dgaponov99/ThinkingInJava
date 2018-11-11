package ru.mail.dgaponov99.Chapter_5;

public class WhatAboutFinalize {

    private static void testSomeClass() {
        new SomeClass();
        System.gc();
    }

    private static void testTank() {
        System.out.println("Экземпляр Tank без очистки:");
        Tank tank = new Tank(25);
        tank = null;
        System.gc();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Экземпляр Tank с очисткой:");
        tank = new Tank(25);
        tank.ravage();
        tank = null;
        System.gc();
    }

    public static void main(String[] args) {
        testTank();
    }
}

class SomeClass {
    @Override
    protected void finalize() {
        System.out.println("Hello from finalize()");
    }
}

class Tank {
    private int fullness;

    public Tank() {
    }

    public Tank(int fullness) {
        this.fullness = fullness;
    }

    public int getFullness() {
        return fullness;
    }

    public void setFullness(int fullness) {
        this.fullness = fullness;
    }

    public void ravage() {
        fullness = 0;
    }

    @Override
    protected void finalize() {
        if (fullness > 0)
            System.out.println("Ошибка! Ёмкость не пуста!");
    }
}
