/*
    Program: First OOP Example in Java
    Author: Amaan Khan
    Concept: Class and Object

    Description:
    This program demonstrates the basic concept of OOP in Java.
    We create a Student class and then create an object of that class
    in the main method.

    Concepts used:
    - Class
    - Object
    - Instance Variables
    - Static Method
*/

class Student {

    // Instance variables (properties of student)
    int rollNum;
    String name;

    // Static method (belongs to class, not object)
    public static void display() {
        System.out.println("Welcome to my first OOP program!");
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating object of Student class
        Student s1 = new Student();

        // Assigning values to object variables
        s1.rollNum = 1;
        s1.name = "Amaan";

        // Calling static method using class name
        Student.display();

        // Printing student details
        System.out.println("Student Roll Number: " + s1.rollNum);
        System.out.println("Student Name: " + s1.name);
    }
}