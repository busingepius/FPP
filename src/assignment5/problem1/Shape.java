/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 22/01/2024
 * Time : 16:22
 * Project Name : assignment5
 */
package assignment5.problem1;

public class Shape {
    String color;

    public Shape(String color) {
        this.color = color;
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * width) + (2 * height);
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side);
    }
}

class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("red", 3),
                new Rectangle("blue", 2, 3),
                new Square("orange", 5),
                new Circle("yellow", 2),
                new Square("black", 5)
        };
        printTotal(shapes);
    }

    public static void printTotal(Shape[] shapes) {
        double total = 0;
        for (Shape shape : shapes) {
            total += shape.calculatePerimeter();
        }
        System.out.println("Total perimeter: " + total);
    }
}