package Main;

interface Polygon {
    double area();
}

class Square implements Polygon {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}

class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area of square: " + square.area());
        System.out.println("Area of rectangle: " + rectangle.area());
    }
}