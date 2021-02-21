package com.company;
/*
Q8. Implement multiple inheritance with default method inside interface.
 */

interface GrandParent{
    default void defaultMethod(){
        System.out.println("Hi i am grandParent Default Method!!!");
    }
}
interface Parent{
    default void defaultMethod(){
        System.out.println("Hi i am Parent Default method!!!");
    }
}
interface Child extends Parent , GrandParent{
    default void defaultMethod(){
        System.out.println("Hi I am child Default method!!!");
    }
}

public class Program implements Child{
    public static void main(String [] args){
        Child c = new Program();
        c.defaultMethod();
    }
}

