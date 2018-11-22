package ru.mail.dgaponov99.Chapter_7;

class BaseClass{
    BaseClass(int i){
        System.out.println("BaseClass's constructor");
    }
}

public class DoterClass  extends BaseClass{
    DoterClass() {
        super(1);
        System.out.println("DoterClass's constructor without args");
    }

    DoterClass(int i) {
        super(i);
        System.out.println("DoterClass's constructor with args");
    }

    public static void main(String[] args) {
        DoterClass doterClass = new DoterClass();
    }
}
