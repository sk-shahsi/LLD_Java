package com.critional.deaign;

import com.sun.source.tree.SynchronizedTree;

public class Singletone_2 {
// Synchronize Block Added
    private static Singletone_2 singletoneObject;

    private Singletone_2(){}
    synchronized static Singletone_2 getInstance(){
        if (singletoneObject == null){
            singletoneObject = new Singletone_2();

        }
        return singletoneObject;
    }
}
class Master_2{
    public static void main(String[] args) {
        Singletone_2 singletone = Singletone_2.getInstance();
        Singletone_2 singletone1 = Singletone_2.getInstance();
        System.out.println(singletone == singletone1);

    }
}
