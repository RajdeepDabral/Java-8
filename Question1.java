package com.company;
/*
Q1.Write the following a functional interface and implement it using lambda:

    (1) First number is greater than second number or not         Parameter (int ,int ) Return boolean
    (2) Increment the number by 1 and return incremented value    Parameter (int) Return int
    (3) Concatination of 2 string                                 Parameter (String , String ) Return (String)
    (4) Convert a string to uppercase and return .                Parameter (String) Return (String)


*/

@FunctionalInterface
interface  functionalInterface1{
    public boolean check(int x , int y);
}
@FunctionalInterface
interface functionalInterface2{
    public int check(int x);
}
@FunctionalInterface
interface functionalInterface3{
    String check(String str1 , String str2);
}
@FunctionalInterface
interface functionalInterface4{
    String check(String str1 );
}

public class ProgramQuestions {
    public static void main(String [] args){
        functionalInterface1 f1 =(int x, int y) -> x > y;
        System.out.println("method 1 Result : "+f1.check(10,20));

        functionalInterface2 f2 =(int x) -> {return ++x;};
        System.out.println("method 2 Result : "+f2.check(10));

        functionalInterface3 f3 =(String str1 , String str2) -> (str1+"-"+str2);
        System.out.println("method 3 Result : "+f3.check("Rajdeep" , "Dabral"));


        functionalInterface4 f4 =(String str1 ) -> str1.toUpperCase();
        System.out.println("method 4 Result : "+f4.check("Rajdeep"));
        
    }
}

