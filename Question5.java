package com.company;
/*
Q5. Implement following functional interfaces from java.util.function using lambdas:
    (1) Consumer
    (2) Supplier
    (3) Predicate
    (4) Function
 */


import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ProgramQuestions {
    public static void main(String [] args){

        //1.Consumer

        List<String> list = new LinkedList<>();
        list.add("Rajdeep");
        list.add("Suraj");
        list.add("Rohit");
        list.add("Simran");
        list.add("sahil");
        Consumer<List<String>> c = (string) -> {
                                    string.stream().forEach(str -> System.out.println(str+" : "+str.length()));
                                };
        c.accept(list);

        //2.Supplier

        Supplier<Double> s =() -> Math.floor(Math.random() * 100);
            System.out.println("Random number : "+s.get());

        //3. Predicate
 
        Predicate<String> p = (string) -> string.length()>5;
            System.out.println("String Length greater then 5 : "+p.test("Rajdeep Dabral"));

        //4. Function

        Function<String , String> f =(str) -> str.toUpperCase() +" :: " + str.length();
            System.out.println(f.apply("Rajdeep Dabral"));
    }
}

