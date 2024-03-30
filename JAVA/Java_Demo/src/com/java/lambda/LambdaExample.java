package com.java.lambda;

interface Shape{
    void draw();
}

//class Rectangle implements  Shape{
//
//    @Override
//    public void draw() {
//        System.out.println("Called Draw method of Rectangle");
//    }
//}

public class LambdaExample {
    public static void main(String[] args) {
        Shape rectangle = () -> {System.out.println("Called rectangle method");};
//        rectangle.draw();
        print(rectangle);


        Shape circle = () -> {
            System.out.println("Called circle method");
        };
        print(circle);
//        circle.draw();
    }

       static void print(Shape shape){
        shape.draw();
    }
}
