package ru.mail.dgaponov99.Chapter_7;

public class NoSuperClass extends Detergent{
    @Override
    public void scrub() {
        append(" NoSuperClass.scrub()");
        super.scrub();
    }

    public void smth() {
        append(" smth()");
    }

    public static void main(String[] args) {
        NoSuperClass x = new NoSuperClass();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Check base class:");
        Detergent.main(args);
    }
}

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) {
        s += a;
    }
    public void dilute(){
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser x = new Cleanser();
        x.dilute();
        x.apply();
        x.scrub();
        System.out.println(x);
    }

}

class Detergent extends Cleanser {
    @Override
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent x = new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Check base class:");
        Cleanser.main(args);
    }

}

class DetergentWithDel {
    Cleanser cleanser = new Cleanser();

    public void append(String a) {
        cleanser.append(a);
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void apply() {
        cleanser.apply();
    }

    public void scrub() {
        cleanser.scrub();
    }
}