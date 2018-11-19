package ru.mail.dgaponov99.Chapter_6;

public class TestConnectionClass {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            System.out.println(ConnectionManager.getConnection());
        }
    }
}
