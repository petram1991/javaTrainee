package org.example.les9;

import org.example.les7.Gender;

public class Main {

    public static void main(String[] args) {

        Person p = new Person("Pietje", 15);

    }
    public void finalize()
    {
        System.out.println("finalize method overriden");
    }


}
