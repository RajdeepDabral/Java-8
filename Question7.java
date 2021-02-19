package com.company;
/*
Q7. Override the default method of the interface.
 */

interface InterfaceDefualtStatic{
    default int defaultMethod(){
        System.out.println("I am Default method!!!");
        return 0;
    }
}

public class ProgramQuestions {
    public static void main(String [] args){
        InterfaceDefualtStatic i1 = new InterfaceDefualtStatic() {
            @Override
            public int defaultMethod() {
                System.out.println("I am Override Method");
                return 1;
            }
        };
        i1.defaultMethod();
    }
}

