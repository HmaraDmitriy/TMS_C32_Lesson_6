package com.teachmeskills_lesson6a;

/*
Задача 1
Создать класс для описания студента нашей группы.
Поля класса: имя, фамилия, номер паспорта, название группы (можно добавить свои поля по желанию - например, возраст).
Создать объекты этого класса для каждого из студента нашей группы.
Поместить все эти обеъекты в массив.
Пройти по массиву циклом for и вывести информацию на консоль.
*/

public class Main {
    public static void main(String[] args) {

        Student[] students = {
                new Student("Oliver", "Abramson","AA1234567", "С32", 20, "male"),
                new Student("Jack ", "Hoggarth ","AA157767", "С32", 30, "male"),
                new Student("Thomas ","Holiday ", "BA73573567", "С32", 24, "male"),
                new Student("Emma","Ables", "TR472775", "С32", 19, "female"),
                new Student("Mia", "Taylor ","AA7627274", "С32", 26, "female"),
                new Student("Sophia","Wilson ","CA6423727", "С32", 22, "female")
        };

       for (Student student : students){
           student.display();
       }
    }
}
