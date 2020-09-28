package org.example.les10;

public class Main {

    public static void main(String[] args) {
       Person p = new Person("Pietje");
        p.greet();
        Android r = new Android();
        r.greet();
        Employee e = new Employee();
        e.greet();
        Teacher t = new Teacher("Tea");
        t.greet();

    }
}
