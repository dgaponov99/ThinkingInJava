package ru.mail.dgaponov99.Chapter_7;

public class Cartoon extends Drawing{
    Cartoon() {
        System.out.println("Cartoon's constructor");
    }

    public static void main(String[] args) {
        Cartoon c = new Cartoon();
        System.out.println(c.s1);
    }
}

class Art {
    String s = "Art";
    Art() {
        System.out.println("Art's constructor");
    }
}

class Drawing extends Art {
    String s1 = super.s;

    Drawing() {
        System.out.println("Drawing's constructor");
    }
}
