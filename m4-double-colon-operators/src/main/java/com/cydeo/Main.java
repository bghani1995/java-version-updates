package com.cydeo;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        //  Predicate<Integer> pred = (p) -> p%2 == 0 ? true : false;// implementation for abstract method that belongs to that functional interface

        Calculate s1 = (x,y) -> Calculator.findSum(x,y);

        //Refers to Static Method - static method can be called through class name
        Calculate s2 = Calculator::findSum;
        s2.calculate(10, 20);

        //Refers to an Instance Method - instance method can only be called through object
        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;
        s3.calculate(4, 2);

        // Calculate s4 = new Calculator() ::findMultiply;

        BiFunction<String, Integer, String> func = (str, i) -> str.substring(i);

        BiFunction<String, Integer, String> func2 = String::substring;





    }
}
