class Operation {
    float squareValue(int n) {
        return n * n;
    }
}

class Circle {
    float pi = 3.14F;
    Operation op;

    Circle(Operation op) {
        this.op = op;
    }

    float Area(int r) {
        float value = op.squareValue(r);
        float area = value * pi;
        System.out.println("Area : " + area);
        return area;
    }
}

class Square {
    Operation op;

    Square(Operation op) {
        this.op = op;
    }

    float getValue(int n) {
        return op.squareValue(n);
    }
}

class Main {
    public static void main(String args[]) {
        Operation op = new Operation();
        Circle c = new Circle(op);
        c.Area(7);

        // Example usage of Square class
        Square square = new Square(op);
        float sv = square.getValue(5);
        System.out.println("Square Value: " + sv);
    }
}
