/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 22/01/2024
 * Time : 13:41
 * Project Name : lecture5
 */
package lecture5;

public abstract class MyAbstract {
    private static int staticVariable;
    private int instanceVariable;

    MyAbstract(int value){
        this.instanceVariable = value;
    }

    public static void staticMethod(){
        System.out.println("My static method");
    }
    public void instanceMethod(){
        System.out.println("My instance method");
    }
    public  abstract void abstractMethod();
}
