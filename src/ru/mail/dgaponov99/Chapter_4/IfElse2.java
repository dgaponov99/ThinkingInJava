package ru.mail.dgaponov99.Chapter_4;

public class IfElse2 {

    static int test(int testval, int target, int begin, int end) {
        if (testval >= begin && testval <= end) {
            System.out.println("принадлежит");
        }

        if (testval > target) {
            return +1;
        } else if (testval < target) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 1, 11));
        System.out.println(test(5, 10, 0, 4));
        System.out.println(test(5, 5, 6, 11));
    }
}
