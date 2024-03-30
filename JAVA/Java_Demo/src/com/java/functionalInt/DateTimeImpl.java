package com.java.functionalInt;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class DateTimeImpl {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier = () ->{
            return  LocalDateTime.now();
        };
        System.out.println(supplier.get());

    }
}
