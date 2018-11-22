package ru.mail.dgaponov99.Chapter_7;

public class FinalOverridingIllusion {

}

class WithFinals {
    void f() {
        System.out.println("WithFinals.f()");
    }

    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {

    @Override
    void f() {

    }

    private void g() {}
}

final class FinalClass {}

/*class DoterClass extends FinalClass {
   увы, но нет
}*/
