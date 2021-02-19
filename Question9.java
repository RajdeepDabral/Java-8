package com.company;
/*
Q9. Collect all the even numbers from an integer list.
 */


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramQuestions{
    public static void main(String [] args){
        List<Integer>  list = new LinkedList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);
        System.out.println(list.stream()
                .filter(number -> number%2==0)
                .collect(Collectors.toList()));
    }
}

