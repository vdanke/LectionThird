package org.step.first.model;

//import org.step.Test;
//import org.step.*;

public class User {

//    private BigNumbers first;
//    protected BigNumbers second;
//    BigNumbers third;
//    public BigNumbers fourth;

    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
