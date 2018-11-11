package ru.mail.dgaponov99.Chapter_3;

import java.util.Random;

public class Coin {

    public static String toss() {
        Random random = new Random();
        return random.nextBoolean() ? "Eagle" : "Tails";
    }

    public static void main(String[] args) {
        System.out.println(Coin.toss());
    }
}
