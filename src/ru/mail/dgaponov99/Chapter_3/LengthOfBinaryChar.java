package ru.mail.dgaponov99.Chapter_3;

public class LengthOfBinaryChar {

    public static void main(String[] args) {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println("'" + c + "'" + " = " + (int) c + " = " + Integer.toBinaryString(c));
        }
    }
}
