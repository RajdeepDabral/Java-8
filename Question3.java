package com.company;
/*
Q3. Using (instance) Method reference create and apply add and subtract method and
using (Static) Method reference create and apply multiplication method
for the functional interface created.
 */

@FunctionalInterface
interface  functionalInterface1{
    public int add(int x , int y);
}

@FunctionalInterface
interface  functionalInterface2{
    public int sub(int x , int y);
}

@FunctionalInterface
interface  functionalInterface3{
    public int multiply(int x , int y);
}

public class ProgramQuestions {

    public int  addition(int x , int y){
        return x + y;
    }

    public int  subtraction(int x , int y){
        return x - y;
    }

    public static int multiplication(int x ,int y){
        return x * y;
    }

    public static void main(String [] args){
        ProgramQuestions p1 = new ProgramQuestions();
        functionalInterface1 f1 = p1::addition;
        System.out.println("Addition : "+f1.add(100,200));

        functionalInterface2 f2 = p1::subtraction;
        System.out.println("Subtraction: "+f2.sub(200,100));

        functionalInterface3 f3 = ProgramQuestions::multiplication;
        System.out.println("Multiplication : "+f3.multiply(20,10));

    }
}

