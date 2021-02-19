package com.company;
/*
Q6. Create and access default and static method of an interface.
 */

interface InterfaceDefualtStatic{
    default int deafultMethod(){
        System.out.println("I am Default method!!!");
        return 0;
    }
    public static void staticMethod(){
        System.out.println("I am Static method!!!");
    }
}

public class ProgramQuestions implements InterfaceDefualtStatic {
    public static void main(String [] args){
        InterfaceDefualtStatic i1 = new ProgramQuestions();

        i1.deafultMethod();
        InterfaceDefualtStatic.staticMethod();

    }
}

