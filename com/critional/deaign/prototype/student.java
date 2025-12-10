package com.critional.deaign.prototype;
//it is used when we have to make copy/clone from existing object...
public class student {
    int age;
    private int rollNumber;
    String name;
    student(){}
    student(int age,int rollNumber,String name){
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

}
class Main{
    public static  void main(String args[]){
        student obj = new student(20,75,"ram");
//        creating clone of obj
        student cloneStudent = new student();
        cloneStudent.age = cloneStudent.age;
        cloneStudent.name = cloneStudent.name;
//        cloneStudent.rollNumber = cloneStudent.rollNumber;
//        this is problem with cloning this private rollnumber is private so we can not clone .....
    }
}
