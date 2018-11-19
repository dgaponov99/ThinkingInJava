package ru.mail.dgaponov99.Chapter_6;

import ru.mail.dgaponov99.Chapter_6.SomePackage.SomeClass;

import ru.mail.dgaponov99.Chapter_6.SomePackage.*;
import java.util.*;

public class NewObjectOfSomeClass {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();

        // Конфликт имен
        //! Vector vector = new Vector();
        //! Vector vector1 = new Vector();

        ru.mail.dgaponov99.Chapter_6.SomePackage.Vector vector = new ru.mail.dgaponov99.Chapter_6.SomePackage.Vector();
        java.util.Vector vector1 = new java.util.Vector<>();
    }

}
