package ru.mail.dgaponov99.Chapter_7;

public class ABC extends A{
    B b = new B();

    ABC(int i) {
        super(i);
    }

    public static void main(String[] args) {
        ABC abc = new ABC(2);
    }
}

class A {
    A(int i) {
        System.out.println("A");
    }
}

class B extends A {
    B() {
        super(10);
        System.out.println("B");
    }
}
