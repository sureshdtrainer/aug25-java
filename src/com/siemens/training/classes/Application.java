package com.siemens.training.classes;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Person.PI= 3.1459;
        Person.sayHello();

        //Create a Person Object using Person class
       /* Person person1 = new Person("John", 25);
        person1.setName("John1");
       // person1.age = 25;
        person1.speak();

        Person person2 = new Person("Suresh", 24);
        //person2.name = "Suresh";
        //person2.age = 24;
        person2.speak();
        person2.speak("English");

        Person person3 = new Person();
        person3.speak();

        System.out.println(person1);
        System.out.println(person2);*/
        System.out.println("*********************");
        Person student1 = new Student();
        Student student = (Student) student1;
        student.walk();
        student1.swim();

    }

}
