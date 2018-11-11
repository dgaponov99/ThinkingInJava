package ru.mail.dgaponov99.Chapter_2;

public class PackagingOfPrimitives {

    public static void main(String[] args) {
        Character ch = new Character('x');
        Character ch1 = 'x';
        char c = ch1;

        System.out.println(ch + " " + ch1 + " " + c);
    }
}
