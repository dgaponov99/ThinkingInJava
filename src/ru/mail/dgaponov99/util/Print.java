package ru.mail.dgaponov99.util;

import java.io.PrintStream;

/**
 * Class to simplify console output.
 *
 * @author Dmitry Gaponov
 * @version 1.0
 */
public class Print {

    /**
     *
     * Prints a object to the console without changing to a new line.
     *
     * @param object The object that is displayed on the console.
     */
    public static void print(Object object) {
        System.out.print(object);
    }

    /**
     * Prints a object to the console with changing to a new line.
     *
     * @param object The object that is displayed on the console.
     */
    public static void println(Object object) {
        System.out.println(object);
    }

    /**
     * Moving the carriage to a new line.
     */
    public static void print() {
        System.out.println();
    }

    /**
     * Formatted output of the object to the console.
     *
     * @param format Format of output.
     * @param object Object for formatted output.
     * @return This output stream.
     */
    public static PrintStream printf(String format, Object object) {
        return System.out.printf(format, object);
    }
}
