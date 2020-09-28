package org.example.les6;


public class Main {
    public static void main(String[] args) {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
        System.out.println(copy[2]);

        //Vraag 2:  row[4] = out of bounds for length 4. De Array heeft maar een lengte van 4.
        //Dus row 4 komt op de 5e positie te staan.
         long[] arry = {1, 2, 3, 4};

    }

}
