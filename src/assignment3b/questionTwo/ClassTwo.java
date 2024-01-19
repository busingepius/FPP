/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 19/01/2024
 * Time : 16:26
 * Project Name : assignment3b
 */
package assignment3b.questionTwo;

public class ClassTwo {
    private int age = 15;
    private  String name = "Musa";
    private static String school = schoolName();



    {
        System.out.print("instance block one");
    }
    {
        System.out.print("instance block two");
    }
    static {
        System.out.print("static initialization block one");
    }
    static {
        System.out.print("static initialization block two");
    }

    public ClassTwo(){}
    public ClassTwo(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void instanceMethodOne(){
        System.out.println("instance method one");
    }
    public void instanceMethodTwo(){
        System.out.println("instance method two");
    }
    public static void staticOne(){
        System.out.println("static method one");
    }
    public static String schoolName(){
        System.out.println("static method two");
        return "MIU";
    }
}
