package com.critional.deaign.prototype.solution;

public class student implements prototype{
    @Override
    public prototype clone() {
        return new student(age,rollNumber,name);
    }
    int age;
    private int rollNumber;
    String name;
    student(){}
    student(int age,int rollNumber,String name){
        this . name=name;
        this.rollNumber = rollNumber;
        this.age = age;

    }

}
