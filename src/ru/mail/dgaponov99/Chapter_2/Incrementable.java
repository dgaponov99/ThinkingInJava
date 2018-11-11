package ru.mail.dgaponov99.Chapter_2;

class Incrementable {

    static void increment() {
        StaticTest.i++;
    }
}

class StaticTest {
    static int i = 47;
}

class TestIncrementable {

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();

        System.out.println(st1.i == st2.i);
        System.out.println(st1.i == StaticTest.i);

        StaticTest.i++;

        System.out.println(st1.i + " " + st2.i);
        
        Incrementable sf = new Incrementable();
        sf.increment();
        Incrementable.increment();

        System.out.println(StaticTest.i);
    }
}
