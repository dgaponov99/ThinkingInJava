package ru.mail.dgaponov99.Chapter_3;

public class TwoConst {

    public static void main(String[] args) {
        final int first = 0x4b;
        final int second = 0xbb;
        System.out.println(Integer.toBinaryString(first));
        System.out.println(Integer.toBinaryString(second));
        System.out.println(Integer.toBinaryString(first & second));
        System.out.println(Integer.toBinaryString(first | second));
        System.out.println(Integer.toBinaryString(first ^ second));
    }
}
