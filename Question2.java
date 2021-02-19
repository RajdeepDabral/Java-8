package com.company;
/*
Q2. Create a functional interface whose method takes 2 integers and return one integer.
*/
@FunctionalInterface
interface  functionalInterface1{
    public int check(int x , int y);
}

public class ProgramQuestions {
    public static void main(String [] args){
        functionalInterface1 f1 =(int x, int y) -> x + y;
        System.out.println("Result : "+f1.check(10,20));
    }
}

