package com.siemens.training.classes;

public abstract class Person{
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

    void speak(String lang){
        System.out.println("My name is : " +name +" and I amm "+age+" year old, I know to speak" + lang);
    }

    public abstract void swim();

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
