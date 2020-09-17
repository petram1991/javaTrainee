package org.example.les7;

public class Person {

    private String name;
    private int age;
    private Gender gender;

    public static final int numberOfPossibleGenders = Gender.values().length;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = Gender.UNKNOWN;
    }


    public void haveBirthday() {
        if (this.age >= 130) throw new PersonDiedException();
        this.age++;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return this.gender;
    }
}
