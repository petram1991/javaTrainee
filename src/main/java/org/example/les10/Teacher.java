package org.example.les10;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    @Override
    void greet() {
        super.greet();
        //extra
        System.out.println("i'm a teacher");
    }
}
