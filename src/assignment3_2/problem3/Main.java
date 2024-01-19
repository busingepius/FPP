/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 17:42
 * Project Name : assignment3_2.problem3
 */
package assignment3_2.problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter C for Circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Triangle");
        String initial = sc.nextLine();
        if(initial.equals("R")){
            System.out.println("Enter the width of the Rectangle");
            double width = sc.nextDouble();
            System.out.println("Enter the height of the Rectangle");
            double height = sc.nextDouble();
            Rectangle rectangle = new Rectangle(width,height);
            System.out.println("The area of Rectangle is: "+rectangle.computerArea());
            sc.close();
        } else
        if(initial.equals("T")){
            System.out.println("Enter the width of the Triangle");
            double base = sc.nextDouble();
            System.out.println("Enter the height of the Rectangle");
            double height = sc.nextDouble();
            Triangle triangle = new Triangle(base,height);
            System.out.println("The area of Rectangle is: "+triangle.computerArea());
            sc.close();
        }else
        if(initial.equals("C")){
            System.out.println("Enter the radius of The Circle");
            double radius = sc.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("The area of Rectangle is: "+circle.computerArea());
            sc.close();
        }
    }
}
