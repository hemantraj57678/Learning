package com.java.functionalInt;

import java.util.function.Function;

class FunctionalImpl implements Function<String,Integer>{

    @Override
    public Integer apply(String s) {
        return s.length();
    }
}


public class FunctionalInt {
    public static void main(String[] args) {
        Function<String, Integer> function = new FunctionalImpl();
        int result = function.apply("Hemantraj");
        System.out.println(result);
    }
}
