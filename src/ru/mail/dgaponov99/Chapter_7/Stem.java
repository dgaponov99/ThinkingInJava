package ru.mail.dgaponov99.Chapter_7;

class Component1 {
    Component1(int i) {
        System.out.println(i + " Component1's constructor");
    }
    void dispose() {
        System.out.println("Component1's dispose");
    }
}
class Component2 {
    Component2(int i) {
        System.out.println(i + " Component2's constructor");
    }
    void dispose() {
        System.out.println("Component2's dispose");
    }
}
class Component3 {
    Component3(int i) {
        System.out.println(i + " Component3's constructor");
    }
    void dispose() {
        System.out.println("Component3's dispose");
    }
}

class Root {
    Component1 component1 = new Component1(2);
    Component2 component2 = new Component2(2);
    Component3 component3 = new Component3(2);

    Root(int i) {
        System.out.println(i + " Root's constructor");
    }

    void dispose() {
        System.out.println("Root's dispose");
        component3.dispose();
        component2.dispose();
        component1.dispose();
    }
}

public class Stem extends Root{
    int i;
    Component1 component1 = new Component1(i);
    Component2 component2 = new Component2(i);
    Component3 component3 = new Component3(i);

    Stem(int i) {
        super(i);
        this.i = i;
        System.out.println(i + " Stem's constructor");
    }

    void dispose() {
        System.out.println("Stem's dispose");
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Stem stem = new Stem(1);

        try {
        } finally {
            stem.dispose();
        }
    }
}
