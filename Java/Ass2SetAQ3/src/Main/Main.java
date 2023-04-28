package Main;
abstract class Shape {
    public abstract double area();
    public abstract double volume();
}

class Cone extends Shape {
    private double radius;
    private double height;

    public Cone() {
        this.radius = 0;
        this.height = 0;
    }

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public String toString() {
        return "Cone with radius " + radius + " and height " + height;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder() {
        this.radius = 0;
        this.height = 0;
    }

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return "Cylinder with radius " + radius + " and height " + height;
    }
}

public class Main {
    public static void main(String[] args) {
        Cone cone = new Cone(3, 5);
        System.out.println(cone.toString());
        System.out.println("Area: " + cone.area());
        System.out.println("Volume: " + cone.volume());

        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println(cylinder.toString());
        System.out.println("Area: " + cylinder.area());
        System.out.println("Volume: " + cylinder.volume());
    }
}