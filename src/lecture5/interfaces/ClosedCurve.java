/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 23/01/2024
 * Time : 12:15
 * Project Name : lecture5.interfaces
 */
package lecture5.interfaces;

public interface ClosedCurve {
    /**BY DEFAULT ALL VARIABLES
     * 1. Are public and static
     *
     * 2. Interface are just implemented not overriden their methods
     * @return double
     *
     */
    //    public abstract double computeArea();
    double computeArea();
}

class Triangle implements ClosedCurve {
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

class Square implements ClosedCurve {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return side * side;
    }
}

class Circle implements ClosedCurve {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }
}

class Test {
    public static void main(String[] args) {
        ClosedCurve[] objects = {
                new Triangle(5,5),
                new Square(3),
                new Circle(3)
        };

        for (ClosedCurve object : objects) {
            System.out.println(object.computeArea());
        }
    }


}
