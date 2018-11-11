package ru.mail.dgaponov99.Chapter_4;

import java.util.Arrays;
import java.util.Random;

public class EasyTask {

    public static void oneToHundred() {
        for (int i = 1; i < 101; i++) {
            if (i == 100)
                break;
                //return;
            System.out.print(i + " ");
        }
    }

    public static void random25() {
        Random random = new Random();
        int a = random.nextInt(100) + 1;
        System.out.print(a);
        for (int i = 0; i < 24; i++) {
            int b = random.nextInt(100) + 1;
            if (b > a) {
                System.out.print(" < ");
            } else if (b < a) {
                System.out.print(" > ");
            } else {
                System.out.print(" = ");
            }
            System.out.print(b);
            a = b;
        }
    }

    public static void primeNumbers() {
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i+1; j++) {
                if (j == i)
                    System.out.println(i);
                if (i % j == 0)
                    break;
            }
        }
    }

    public static void repeat10() {
        String first = "101000";
        String second = "001010";

        for (int i = 0; i < 6; i++) {
            System.out.print((first.charAt(i) == '0' || second.charAt(i) == '0') ? 0 : 1);
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print((first.charAt(i) == '1' || second.charAt(i) == '1') ? 1 : 0);
        }
    }

    public static void fibonacci(int n) {
        int first = 1;
        int second = 1;
        System.out.print(first + " ");
        System.out.print(second + " ");
        for (int i = 2; i < n; i++) {
            System.out.print(first + second + " ");
            int temp = first + second;
            first = second;
            second = temp;
        }
    }

    public static void vampires() {
        for (int i = 10; i < 100; i++) {
            for (int j = 10; j < 100; j++) {
                String result = i * j + "";
                if (result.length() != 4)
                    continue;
                char[] first = result.toCharArray();
                char[] second = (i + "" + j).toCharArray();
                Arrays.sort(first);
                Arrays.sort(second);
                if (Arrays.equals(first, second)) {
                    System.out.println(result + " = " + i + " * " + j);
                }
            }
        }
    }


    public static void main(String[] args) {
        //oneToHundred();
        //random25();
        //primeNumbers();
        //repeat10();
        //fibonacci(10);
        vampires();
    }
}
