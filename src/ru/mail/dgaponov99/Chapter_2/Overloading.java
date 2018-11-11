package ru.mail.dgaponov99.Chapter_2;

/**
 * Class of tree
 * Suitable for describing the height of the tree
 * @author Bruce Eckel
 * @version 4.0
 */
class Tree {
    /**
     * Height of the tree
     */
    int height;

    /**
     * new tree without height
     */
    public Tree() {
        System.out.println("Сажаем росток");
        height = 0;
    }

    /**
     * new tree with height
     * @param height height of new tree
     */
    public Tree(int height) {
        this.height = height;
        System.out.println("Создание нового дерева высотой " + height + "м.");
    }

    /**
     * print information about the tree
     */
    void info() {
        System.out.println("Дерево высотой " + height + "м.");
    }

    /**
     * print information about the tree with string from client
     * @param s string from client
     */
    void info(String s){
        System.out.println(s + " : Дерево высотой " + height + "м.");
    }
}

/**
 * Overload demonstration class
 * @author Bruce Eckel
 * @version 4.0
 */
public class Overloading {

    /**
     * the entry point to the program
     * uses various overloaded methods of the tree class
     * @param args string's arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree tree = new Tree(i);
            tree.info();
            tree.info("Перегруженный метод");
        }
        //Перегруженный конструктор
        new Tree();
    }
}
