package org.example.les3;


public class HourGlass {
    public static void glass(int n) {

        if (n % 2 == 0) {
            throw new ArithmeticException();
        }

        printHourglass(n);

    }

    private static void printHourglass(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 1; i <= n / 2 - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < n - 2 * i - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i <= n / 2 - 1; i++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();

        for (int i = n / 2 - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < n - 2 * i - 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}