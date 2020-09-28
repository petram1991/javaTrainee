package org.example.les6;

public class OpdrachtThree {
    public static long[] aArrayLength(long[] arry) {
        long[] longerarray = new long[arry.length * 2];

        for (int i = 0; i < arry.length; i++) {
            longerarray[i] = arry[i];

            System.out.println(longerarray[i]);
        }
        return longerarray;
    }
}

