package com.company;
/*
Q12. Find the first even number in the integer list which is greater than 3.
 */

import java.util.stream.IntStream;

public class ProgramQuestions{
    public static void main(String [] args){
        IntStream list = IntStream.of(1,2,3,5,9,6,7,8,10);
        System.out.println(list.filter((x) -> x%2==0 && x>3).findFirst());
    }
}

