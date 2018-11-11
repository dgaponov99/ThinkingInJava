package ru.mail.dgaponov99.Chapter_5;

public class Enums {
    enum Banknotes {
        RUBLE, DOLLAR, EURO, POUND, YUAN, DALASI
    }

    public static void main(String[] args) {
        for (Banknotes b: Banknotes.values()){
            System.out.println("Banknote: " + b + " ordinal: " + b.ordinal());
            switch (b) {
                case RUBLE:
                    System.out.println("Russian");
                    break;
                case DOLLAR:
                    System.out.println("USA");
                    break;
                case EURO:
                    System.out.println("Europa");
                    break;
                case POUND:
                    System.out.println("British");
                    break;
                case YUAN:
                    System.out.println("China");
                    break;
                case DALASI:
                    System.out.println("Africa");
            }
        }
    }
}
