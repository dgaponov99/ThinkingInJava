package ru.mail.dgaponov99.Chapter_7;

import ru.mail.dgaponov99.Chapter_7.SomePackage.BaseClass;

public class YouCannotButICan extends BaseClass{
    {
        System.out.println(string);
    }

    public static void main(String[] args) {
        YouCannotButICan i = new YouCannotButICan();
    }
}

class ICannot {
    public void pringString() {
        BaseClass b = new BaseClass();
        //! System.out.println(b.string);
    }

    public static void main(String[] args) {
        ICannot iCannot = new ICannot();
        iCannot.pringString();
        System.out.println(":(");
    }
}
