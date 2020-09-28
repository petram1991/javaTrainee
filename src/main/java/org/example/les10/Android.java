package org.example.les10;

public class Android extends Human implements Chargeable{


    void greet(){
        System.out.println("I'm only half human, but human still...");
    }

    @Override
    public int charge(int amount) {
        return 0;
    }
}
