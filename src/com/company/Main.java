package com.company;

import peaksoft.company.Laptop;

public class Main {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setLaptopName("HP");
        laptop.setMemory(512);
        laptop.setColor("Blue");
        laptop.setCPU("Intel core i7");

        Laptop laptop2 = new Laptop();
        laptop2.setLaptopName("ASUS");
        laptop2.setMemory(256);
        laptop2.setColor("Grey");
        laptop2.setCPU("Intel core i9");


        Student student = new Student();
        student.setName("Mavliuda");
        student.setAge(19);
        student.setGroup("Java-5");
        student.setStudentsLaptop(laptop);
        student.showInfo();

        student.studentStudy();
        student.studentPlay();

        System.out.println("+-------------------------------------------------------");

        Student boy = new Student();
        boy.setName("Meder");
        boy.setAge(21);
        boy.setGroup("Java-4");
        boy.setStudentsLaptop(laptop2);

        boy.showInfo();

        boy.studentStudy();
        boy.studentPlay();

        String[] rooms = {"Facebook", "Apple", "SpaceX", "Google", "Starlink"};
        Student[] students = {student, boy};

        Peaksoft peaksoft = new Peaksoft();
        peaksoft.setName("Peaksoft");
        peaksoft.setRooms(rooms);
        peaksoft.setStudents(students);

        peaksoft.showInfo();

        SolutionResult solutionResult = new SolutionResult();
        System.out.println( solutionResult.getCount());
    }
}