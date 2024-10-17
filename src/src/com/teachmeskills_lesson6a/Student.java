package com.teachmeskills_lesson6a;

public class Student {
    String firstName;

    String lastName;
    String passportNumber;
    String groupName;
    int age;
    String sex;

    public Student (String firstName,  String lastName, String passportNumber, String groupName, int age,String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.groupName = groupName;
        this.age = age;
        this.sex = sex;
    }

    public void display() {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.println("Паспорт: " + passportNumber);
        System.out.println("Группа: " + groupName);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + sex);
        System.out.println();
    }
}
