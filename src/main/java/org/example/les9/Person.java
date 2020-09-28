package org.example.les9;

public class Person {

        private String name;
        private int age;
        private String gender;

        public Person(String name){
            this(name, 0);
        }

        public Person(String name, int age){
        this(name, age, "unknown");
        }


    public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }
}
