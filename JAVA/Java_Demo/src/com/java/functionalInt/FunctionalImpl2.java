package com.java.functionalInt;

import java.util.function.Function;

public class FunctionalImpl2 {
    public static void main(String[] args) {

        Function<String, Integer> f = (String s) -> {return s.length();};
        System.out.println(f.apply("hhsjhjshjshdhjhdhhsjhdjhsjd"));
    }
}
