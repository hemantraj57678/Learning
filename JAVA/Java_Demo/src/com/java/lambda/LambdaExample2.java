package com.java.lambda;

interface Shape1{
    void draw();
}


public class LambdaExample2 {
    public static void main(String[] args) {
        print(() -> System.out.println("Rectangle called"));
        print(() -> System.out.println("Circle called"));


    }

    static void print(Shape1 shape){
        shape.draw();
    }




}
