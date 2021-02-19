package com.company;
/*
Q8. Implement multiple inheritance with default method inside interface.
 */

interface GrandParent{
    default void grandParentDefaultMethod(){
        System.out.println("Hi i am grandParent Default Method!!!");
    }
}
interface Parent extends GrandParent{
    default void ParentDefaultMethod(){
        System.out.println("Hi i am Parent Default method!!!");
    }
}
interface Child extends Parent{
    default void childDefaultMethod(){
        System.out.println("Hi I am child Default method!!!");
    }
}

public class ProgramQuestions implements Child{
    public static void main(String [] args){
        Child c = new ProgramQuestions();
        c.grandParentDefaultMethod();
        c.ParentDefaultMethod();
        c.childDefaultMethod();
    }
}

