package org.example.les10;

public class Person extends Human {

    private String name;
    private int age;
    private String gender;

    public Person(){

    }
    public Person(String name) {
        this(name, 0);
    }

    public Person(String name, int age) {
        this(name, age, "unknown");
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void greet(){
        System.out.println( "Hello, my name is " + name + " Nice to meet you!");
    }
}