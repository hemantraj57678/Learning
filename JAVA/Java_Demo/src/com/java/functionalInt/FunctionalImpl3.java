package com.java.functionalInt;

import java.util.function.Consumer;

public class FunctionalImpl3 {
    public static void main(String[] args) {

        Consumer<String> consumer = (String s) ->{
            System.out.println(s.length());
        };
        consumer.accept("sdjhd");
    }
}
