package ru.mail.dgaponov99.Chapter_7;

public class Frog extends Amphibian{

    @Override
    void method() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Amphibian amphibian = new Frog();
        amphibian.method();
    }
}

class Amphibian {
    void method(){
    }
}
