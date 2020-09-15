package org.example;

import org.example.les2.Test;
import org.example.les3.ElevenProof;

import org.example.les3.SetNumber;


public class Start {

    public static void main(String[] args) {

        SetNumber.number();
        Test.sum();
        Test.test();
        ElevenProof.bankAccount();


        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;

        System.out.println(j);

    }
}
