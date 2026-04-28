abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    double r = 5;

    @Override
    void area() {
        double result = Math.PI * r * r;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {
    int l = 4, b = 6;

    @Override
    void area() {
        int result = l * b;
        System.out.println("Area of Rectangle = " + result);
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.area();
        s2.area();
    }
}