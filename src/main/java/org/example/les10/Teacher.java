package org.example.les10;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    @Override
   public String greet() {
        super.greet();
        //extra
        return ("i'm a teacher");
    }
}
