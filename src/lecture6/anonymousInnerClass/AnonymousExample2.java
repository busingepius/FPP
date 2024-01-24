/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 12:24
 * Project Name : lecture6.anonymousInnerClass
 */
package lecture6.anonymousInnerClass;

public class AnonymousExample2 {
    public static void main(String[] args) {
        MyInterface cl1 = new MyInterface() {
            @Override
            public void myAbstractMethod1() {
                System.out.println("Implementation of the abstract method 1");
            }

            @Override
            public void myAbstractMethod2() {
                System.out.println("Implementation od the abstract method 2");
            }
        };
        cl1.myAbstractMethod1();

        // local inner class
        class MyImpl implements MyInterface {
            @Override
            public void myAbstractMethod1() {
                System.out.println("Implementation of the abstract method 1");
            }

            @Override
            public void myAbstractMethod2() {
                System.out.println("Implementation of the abstract method 2");
            }
        }
        MyImpl cl2 = new MyImpl();
        cl2.myAbstractMethod1();
    }

}

interface MyInterface {
    void myAbstractMethod1();

    void myAbstractMethod2();
}

