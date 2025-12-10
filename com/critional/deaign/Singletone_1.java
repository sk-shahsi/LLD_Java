package com.critional.deaign;

public class Singletone_1 {
    //this class is Lazy Initialization
    private static  Singletone_1 singletone1;

    private Singletone_1(){}

    public static Singletone_1 getInstance(){
        if (singletone1 == null){
            singletone1 = new Singletone_1();
        }
        return singletone1;
    }
}
class Master {
    public static void main(String[] args) {
        Singletone_1 singletone1 = Singletone_1.getInstance();
        System.out.println(singletone1);

    }
}
