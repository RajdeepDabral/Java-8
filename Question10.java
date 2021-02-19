package com.company;
/*
Q10. Sum all the numbers greater than 5 in the integer list.
 */


import java.util.LinkedList;
import java.util.List;

public class ProgramQuestions{
    public static void main(String [] args){
        List<Integer>  list = new LinkedList<>();
        list.add(10);
        list.add(11);
        list.add(21);
        list.add(3);
        list.add(4);
        list.add(15);
        list.add(1);
        list.add(7);
        list.add(18);
        list.add(5);
        list.add(21);
        System.out.println("Total sum : "+list.stream()
                .filter(number -> number>5)
                .reduce(0,(x,y) -> x + y)
        );
    }
}

