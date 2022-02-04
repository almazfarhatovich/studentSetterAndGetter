package com.company;

import peaksoft.company.Laptop;

public class Student {

    private String name;
    private int age;
    private String group;
    private Laptop studentsLaptop;

    public void studentStudy() {
        System.out.println(getName() + " study in peaksoftHouse");
    }

    public void studentPlay() {
        System.out.println(getName() + " love play football");
    }


    public void showInfo() {
        System.out.println("info");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("group = " + group);
        studentsLaptop.showInfo();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.matches("[A-Za-z]*")) {
            this.name = name;
        } else {
            System.out.println("error name is not valid");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public Laptop getStudentsLaptop()
    {
        return studentsLaptop;
    }

    public void setStudentsLaptop(Laptop studentsLaptop)
    {
        this.studentsLaptop = studentsLaptop;
    }
}