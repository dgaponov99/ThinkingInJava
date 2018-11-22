package ru.mail.dgaponov99.Chapter_7;

import java.util.Random;

public class StaticFinal {
    static Random random = new Random();
    final int i = random.nextInt(20);
    static final int SUPER_J = random.nextInt(20);

    public static void main(String[] args) {
        StaticFinal staticFinal = new StaticFinal();
        System.out.println(staticFinal);
        System.out.println(staticFinal.i);
        System.out.println(staticFinal.SUPER_J);

        staticFinal = new StaticFinal();
        System.out.println(staticFinal);
        System.out.println(staticFinal.i);
        System.out.println(staticFinal.SUPER_J);
    }
}

class AgainFinal {
    final StaticFinal i;

    public AgainFinal() {
        i = new StaticFinal();
    }

    AgainFinal(StaticFinal i) {
        this.i = i;
    }

    public static void main(String[] args) {
        AgainFinal againFinal = new AgainFinal();
        System.out.println(againFinal.i.i);
        System.out.println(againFinal.i.SUPER_J);
        AgainFinal againFinal1 = new AgainFinal(new StaticFinal());
        System.out.println(againFinal1.i.i);
        System.out.println(againFinal1.i.SUPER_J);
    }
}
