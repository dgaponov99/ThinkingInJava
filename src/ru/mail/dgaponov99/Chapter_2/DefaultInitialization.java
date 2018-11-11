package ru.mail.dgaponov99.Chapter_2;

class DefaultInitialization {
    int anInt;
    char aChar;
}

class TestDefaultInitialization {

    public static void main(String[] args) {
        DefaultInitialization defaultInitialization = new DefaultInitialization();
        System.out.println(defaultInitialization.anInt);
        System.out.println(defaultInitialization.aChar);
    }
}