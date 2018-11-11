package ru.mail.dgaponov99.Chapter_3;

import java.util.Random;

public class Velocity {

    public static void main(String[] args) {

        Random random = new Random();
        double distance = random.nextDouble() * (random.nextInt(1000) + 1);
        double time = random.nextDouble() * (random.nextInt(1000) + 1);
        double velocity = distance / time;
        System.out.println(velocity);
    }
}
