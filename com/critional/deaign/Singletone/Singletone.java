package com.critional.deaign.Singletone;

public class Singletone {
//    Egger Initialization
    //this class objective is to create only one and one object

    private static Singletone singletone = new Singletone();

    private Singletone(){}
    public static Singletone getInstance(){
        return singletone;
    }
}
class Main{
    public static void main(String[] args) {
        Singletone singletone = Singletone.getInstance();
        Singletone s = Singletone.getInstance();
        System.out.println(singletone);
        System.out.println(s);
    }
}
