/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 15:17
 * Project Name : assignment3_2.problem3
 */
package assignment3_2.problem3;

public final class Circle {
    private final double radius;
    private final double PI;

    public Circle(double radius) {
        this.radius = radius;
        this.PI = Math.PI;
    }

    public double getRadius() {
        return radius;
    }

    public double computerArea() {
        return PI * radius * radius;
    }
}
