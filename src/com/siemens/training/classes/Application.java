package com.siemens.training.classes;

class Person{


    //Classes can contain
    //1.Attributes or Data
    //instance variables
    private String name;
    private int age;

    //static variable
    final static double PI = 3.14;

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

    //Default constructor
    public Person(){
        System.out.println("Person Default Constructor called... ");
        name = "DEFAULT";
        age= 25;
    }

    //Parameterized Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Parameterized  Constructor called... ");
    }

    //2. Methods or Behaviour

    void speak(){
        System.out.println("My name is : " +name +" and I amm "+age+" year old");
    }

    public static void sayHello(){
        System.out.println("Hello" + PI );
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Person.PI= 3.1459;
        Person.sayHello();

        //Create a Person Object using Person class
        Person person1 = new Person("John", 25);
        person1.setName("John1");
       // person1.age = 25;
        person1.speak();

        Person person2 = new Person("Suresh", 24);
        //person2.name = "Suresh";
        //person2.age = 24;
        person2.speak();

        Person person3 = new Person();
        person3.speak();

        System.out.println(person1);
        System.out.println(person2);

    }

}
