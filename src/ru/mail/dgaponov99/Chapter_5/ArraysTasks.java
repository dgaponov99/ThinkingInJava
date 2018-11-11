package ru.mail.dgaponov99.Chapter_5;

public class ArraysTasks {

    private static void stringArray() {
        String[] strings = {"hello", "world", "!",};
        for (String s: strings) {
            System.out.print(s + " ");
        }
    }

    private static void testArrayOfObject() {
        ArrayOfObjects[] arrayOfObjects = new ArrayOfObjects[10];
        for (int i = 0; i < arrayOfObjects.length; i++) {
            arrayOfObjects[i] = new ArrayOfObjects(i + "");
        }
    }

    private static void testStringArguments() {
        new StringArguments("hello", "world", "!");
        new StringArguments(new String[]{"this", "is", "array"});
    }

    public static void main(String[] args) {
        testStringArguments();
    }
}

class ArrayOfObjects {

    public ArrayOfObjects(String string) {
        System.out.println(string);
    }
}

class StringArguments {
    public StringArguments(String... args) {
        for (String s: args){
            System.out.println(s);
        }
    }
}
