package org.example.les11;

import org.example.les10.Human;

public class Person extends Human {

    private String name;
    private int age;
    private String gender;
    private HistoryRecord[] history = new HistoryRecord[20];
    private int index = 0;

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
    @Override
    public String greet(){
        return ( "Hello, my name is " + name + " Nice to meet you!");
    }

    public void addHistory(String descr) {
        this.history[index++] = new HistoryRecord(descr);
    }
    public void printHistory(){
        for (int i = 0; i < index; i++) {
            System.out.println(history[i]);
        }
    }
    public Human createSubHuman() {
        return new Human() {
            @Override
            public String greet() { return "Sub is the best."; }
        };
    }

    private class HistoryRecord{
        String description;

        public HistoryRecord(String description){
            this.description = description;
        }

        @Override
        public String toString() {
            return description;
        }
    }
}

