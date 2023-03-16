package org.example;

import java.io.Serializable;

public class Person implements Serializable {
    String surname;
    String name;
    int age;
    Adress adress;

    public Person(String surname, String name, int age, Adress adress) {
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.adress = adress;
    }

    public Person() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "surname= " + surname + '\'' +
                ", name= " + name + '\'' +
                ", age= " + age +
                ", adress=" + adress.city +", "+adress.getTown()+",phone number: "+ adress.getPhoneNumber();
    };
    }

