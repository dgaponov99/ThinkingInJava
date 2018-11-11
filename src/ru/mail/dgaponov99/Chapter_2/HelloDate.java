package ru.mail.dgaponov99.Chapter_2;


import java.util.Date;

/**
 * Выводит строку и текущее число.
 * @author Брюс Эккель
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {
    /** Точка входа в класс и приложение
     * @param args Массив строковых аргументов
     */
    public static void main(String[] args) {
        System.out.println("Привет, сегодня:");
        System.out.println(new Date());
    }
}
