// File Name: Java_Inheritance_Basic_Example.java
// Author: Amaan Khan
// Topic: Inheritance in Java
// Description:
// This program demonstrates a simple example of inheritance.
// The Student class inherits properties and methods from the Person class.

// Parent Class
class Person {

    // Variable of Person class
    String personName = "Amaan";

    // Method of Person class
    void displayPersonInformation() {
        System.out.println("This is a person");
    }
}

// Child Class
// Student class inherits Person class using "extends"
class Student extends Person {

    // Method specific to Student class
    void studySubject() {
        System.out.println("Student is studying");
    }
}

// Main Class
public class Java_Inheritance_Basic_Example {

    public static void main(String[] args) {

        // Creating object of Student class
        Student studentObject = new Student();

        // Accessing variable inherited from Person class
        System.out.println(studentObject.personName);

        // Calling method from Person class
        studentObject.displayPersonInformation();

        // Calling method from Student class
        studentObject.studySubject();
    }
}