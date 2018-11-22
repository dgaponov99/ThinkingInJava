package ru.mail.dgaponov99.Chapter_7;

class RunClass {
    public static void main(String[] args) {
        DoteBeetle.printInit("Hello world");
    }
}

public class DoteBeetle extends Beetle{
    private int n = printInit("Initialized field DoteBeetle.n");
    DoteBeetle() {
        System.out.println("n = " + n);
        System.out.println("j = " + j);
    }
    private static int x3 = printInit("Initialized field static DoteBeetle.x3");

    /*public static void main(String[] args) {

    }*/
}

class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 = printInit("Initialized field static Insect.x1");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Beetle extends Insect {
    private int k = printInit("Initialized field Beetle.k");
    Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("Initialized field static Beetle.x2");

    /*public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle beetle = new Beetle();
    }*/
}
