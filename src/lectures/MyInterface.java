package lectures;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 10:26
 * Project Name : PACKAGE_NAME
 */

public interface MyInterface {
//    public static final --> all variables are static final public constants
    int MY_CONSTANT = 10;
//    public abstract --> all unimplemented methods are public and abstract implicitly
    void myAbstractMethod();

//    default methods are implicitly public
    default void myMethodWithBody(){
        System.out.println("Implemented method is default");
    }
//    static methods are always public
    static void myStaticMethod(){
        System.out.println("my static method in the interface");
    }
}


class MyClass implements MyInterface{

    @Override
    public void myAbstractMethod() {
        MyInterface.myStaticMethod();
    }
}
