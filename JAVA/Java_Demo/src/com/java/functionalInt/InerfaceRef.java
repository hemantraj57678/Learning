package com.java.functionalInt;

import java.util.function.Function;

public class InerfaceRef {
    public static void main(String[] args) {


//        // Lambda experssion
//        Function<Integer, Double> function = (input) -> Math.sqrt(input);
//        System.out.println(function.apply(16));

        Function<Integer, Double> function = Math::sqrt;
        System.out.println(function.apply(81));


    }
}
