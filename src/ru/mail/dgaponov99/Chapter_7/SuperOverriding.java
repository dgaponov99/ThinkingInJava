package ru.mail.dgaponov99.Chapter_7;

class SomeBaseClass {
    void method(int i) {
        System.out.println("int");
    }

    void method(char c) {
        System.out.println("char");
    }

    void method(String s) {
        System.out.println("String");
    }
}

class SuperOverloading extends SomeBaseClass {
    void method(long l){
        System.out.println("long");
    }

    public static void main(String[] args) {
        SuperOverloading superOverriding = new SuperOverloading();
        superOverriding.method(1);
        superOverriding.method('f');
        superOverriding.method("hello");
        superOverriding.method(1L);
    }
}

public class SuperOverriding extends SuperOverloading {
    @Override
    void method(int i) {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
        SuperOverloading.main(args);
        SuperOverriding superOverriding = new SuperOverriding();
        superOverriding.method(23);
    }
}
