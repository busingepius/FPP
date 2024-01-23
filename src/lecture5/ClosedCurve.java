/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 22/01/2024
 * Time : 14:05
 * Project Name : lecture5
 */
package lecture5;

public abstract class ClosedCurve {
    abstract double computeArea();
}

class Triangle extends ClosedCurve {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return (0.5 * height * base);
    }
}

class Square extends ClosedCurve {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return side * side;
    }
}

class Circle extends ClosedCurve {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double computeArea() {
        return Math.PI * radius * radius;
    }
}

class Test {
    public static void main(String[] args) {
        ClosedCurve[] objects = {
                new Triangle(3, 3),
                new Square(3),
                new Circle(3)
        };

        for (ClosedCurve o : objects) {
            System.out.println(o.computeArea());
        }
    }
}