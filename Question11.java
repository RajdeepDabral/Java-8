package com.company;
/*
Q11. Find average of the number inside integer list after doubling it.
 */

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ProgramQuestions{
    public static void main(String [] args){
        IntStream list = IntStream.of(1,2,3,4,5,6,7,8,9,10);
        OptionalDouble obj = list.map((x) -> x + x).average();
        System.out.println(obj);
    }
}

