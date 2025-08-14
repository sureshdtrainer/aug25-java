package com.siemens.training.classes;

public class Student extends Person implements Trainable{

    public Student(){
        super("Default", 20);
        System.out.println("Student Default Constructor");
    }

    @Override
    public void speak(String lang){
        System.out.println("This is Child class speak");
    }

    @Override
    public void swim() {
        System.out.println("I am swimming");
    }

    public void walk(){
        System.out.println("I am walking");
    }

    @Override
    public void train() {
        System.out.println("I am getting trained on Java");
    }
}
