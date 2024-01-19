/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 15:12
 * Project Name : assignment3_2.problem3
 */
package assignment3_2.problem3;

public final class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return height;
    }

    public double computerArea() {
        return width * height;
    }
}
