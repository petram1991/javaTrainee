package org.example.les5;

public class Start {
    public static void main(String[] args) {
        OpdrachtOne calc = new OpdrachtOne();
        int max = calc.greatest(9, 13);
        System.out.println(max);

        String naam = calc.greatest("Tom", "Petra");
        System.out.println(naam);

        max = calc.greatest(3, 20, 5, 6);
        System.out.println(max);

        int factorial = calc.factorial(5);
        System.out.println(factorial);

    }
}
