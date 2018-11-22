package ru.mail.dgaponov99.Chapter_7;

public class NotEasyClass {
    EasyClass easyClass;

    void environ() {
        easyClass = new EasyClass();
        System.out.println("We used:");
        System.out.println(easyClass);
    }

    public static void main(String[] args) {
        NotEasyClass notEasyClass = new NotEasyClass();
        notEasyClass.environ();
    }
}

class EasyClass {
    @Override
    public String toString() {
        return "This is Easy Class, guys";
    }
}


