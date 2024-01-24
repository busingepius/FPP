/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 14:07
 * Project Name : lecture6.lambdaExpressions
 */
package lecture6.lambdaExpressions;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        // anonymous inner class
        MyFunctionalInterface f1 = new MyFunctionalInterface() {
            @Override
            public void abstractMethod() {
                System.out.println("Hello");
            }
        };
        f1.abstractMethod();
        // Lambda expression ONLY FOR FUNCTIONAL INTERFACES
        MyFunctionalInterface f2 = ()-> System.out.println("Hello");
        f2.abstractMethod();

        /** USAGE
         *  #. abstract method has no parameter
         *  1. body of the method is just one line code
         *  ()->System.out.println("Hello")
         *  2. body of the method is multiple lines of code
         *  ()->{
         *      int a = 10;
         *      System.out.println("Hello");
         *  }
         *  3. abstract method return one value
         *  3.1 method body is one line
         *  ()->10;
         *  3.2 method body has multiple lines of code
         *  ()->{
         *      int b = 12;
         *      return b;
         *  }
         */
    }
}

@FunctionalInterface
interface MyFunctionalInterface{
    // has only one abstract method
    void abstractMethod();
    // has methods of the Object class unimplemented
    String toString();
    int hashCode();
    boolean equals(Object object);
    static void print1(){
        System.out.println("1");
    }
    default void print2(){
        System.out.println("2");
    }
}