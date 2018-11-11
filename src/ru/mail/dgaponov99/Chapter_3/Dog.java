package ru.mail.dgaponov99.Chapter_3;

public class Dog {
    private String name;
    private String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public String getName() {
        return name;
    }

    public String getSays() {
        return says;
    }

    @Override
    public String toString() {
        return "Dog " + name + " say: " + says;
    }

    public static void main(String[] args) {
        Dog sport = new Dog("Sport", "Gav!");
        Dog scruffy = new Dog("Scruffy", "Gav gav!!");
        System.out.println(sport);
        System.out.println(scruffy);

        Dog sportClone = sport;
        System.out.println("Sport == SportClone is " + (sport == sportClone));
        System.out.println("Sport.equals(SportClone) is " + sport.equals(sportClone));
    }
}
