package ru.mail.dgaponov99.Chapter_3;

public class Shifts {

    public static void main(String[] args) {
        System.out.println("Part 1:");
        int number = 0x20;
        System.out.println("   " + Integer.toBinaryString(number));
        int len = Integer.toBinaryString(number).length();
        for (int i = 0; i < len; i++) {
            System.out.println(">> " + Integer.toBinaryString(number >>= 1));
        }

        System.out.println();
        System.out.println("Part 2:");

        number = 0xff;
        System.out.println("\t" + Integer.toBinaryString(number));
        System.out.println("<<  " + Integer.toBinaryString(number <<= 1));
        len = Integer.toBinaryString(number).length();
        for (int i = 0; i < len; i++) {
            System.out.println(">>>  " + Integer.toBinaryString(number >>>= 1));
        }
    }
}
