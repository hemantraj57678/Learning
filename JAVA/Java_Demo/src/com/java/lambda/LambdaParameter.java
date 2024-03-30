package com.java.lambda;


interface  AddInt{
    int adding(int a, int b);
}

class AddClass implements  AddInt{

    @Override
    public int adding(int a, int b) {
        return a+b;
    }
}

public class LambdaParameter {
    public static void main(String[] args) {
        AddInt addInt = (int a, int b) -> {return  a+b;};
        System.out.println(addInt.adding(5,6));
    }
}
