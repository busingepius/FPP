/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 23/01/2024
 * Time : 11:10
 * Project Name : lecture5.section5
 */
package lecture5.section5;

public class Parent {
    int x = parentStaticMethod2();
    static int y = parentStaticMethod1();
    Parent(int x){this.x = x;
        System.out.println("parent constructor method");}

    {
        System.out.println("Parent Instance Block A");
    }
    static {
        System.out.println("Parent static block A");
    }
    static {
        System.out.println("Parent static block B");
    }
    {
        System.out.println("Parent Instance Block B");
    }

    static int parentStaticMethod1(){return 100;}
    static int parentStaticMethod2(){return 200;}

    void parentInstanceMethod1(){
        System.out.println("Parent Instance method 1");
    }

    public int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void setY(int y) {
        Parent.y = y;
    }
}
