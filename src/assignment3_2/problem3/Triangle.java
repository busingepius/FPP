/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 15:20
 * Project Name : assignment3_2.problem3
 */
package assignment3_2.problem3;

public final class Triangle {
    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public static class Main {
    }

    public double computerArea() {
        return 0.5 * base * height;
    }
}
