package ru.mail.dgaponov99.Chapter_3;

class Pencil {
    float length;
}

class Assignment {

    public static void main(String[] args) {
        Pencil pencil1 = new Pencil();
        Pencil pencil2 = new Pencil();
        pencil1.length = 23;
        pencil2.length = 14;
        System.out.println(pencil1.length + " " + pencil2.length);
        pencil1 = pencil2;
        System.out.println(pencil1.length + " " + pencil2.length);
        pencil2.length = 10;
        System.out.println(pencil1.length + " " + pencil2.length);

        someMethod(pencil1);
        System.out.println(pencil1.length + " " + pencil2.length);
    }

    private static void someMethod(Pencil pencil) {
        pencil.length = 4;
    }
}
