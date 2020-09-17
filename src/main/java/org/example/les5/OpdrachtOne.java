package org.example.les5;

public class OpdrachtOne {

    public int greatest(int i, int j){
        return Math.max(i, j);
    }

    public String greatest(String st1, String st2 ){
        if (st1.length() >= st2.length()) {
            return st1;
        } else {
            return st2;
        }
    }

    public int greatest(int... ints) {
        int max = ints[0];
        for (int i : ints) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public int factorial(int n){
        if (n <= 1) {
            return 1;
        }
        return n * factorial (n - 1);
    }
}
