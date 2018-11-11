package ru.mail.dgaponov99.Chapter_3;

public class SuperLong {

    public static void main(String[] args) {
        long hexadecimalNumber = 0x9c;
        long octalNumber = 0234;
        System.out.println("Hex: " + Long.toBinaryString(hexadecimalNumber));
        System.out.println("==");
        System.out.println("Oct: " + Long.toBinaryString(octalNumber));
        System.out.println("is " + (hexadecimalNumber == octalNumber));
    }
}
