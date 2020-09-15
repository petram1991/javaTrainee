package org.example.les3;

import java.util.Scanner;

public class SetNumber {
    public static void number(){
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Set a number");
    boolean valid;
        do {
        valid = true;
        int n = myObj.nextInt();
        try {
            HourGlass.glass(n);
        } catch (Exception e) {
            System.out.println("Dit is een even nummer, probeer opnieuw");
            valid = false;
        }
    }
        while (!valid);
}}
