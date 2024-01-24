/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 12:12
 * Project Name : lecture6.anonymousInnerClass
 */
package lecture6.anonymousInnerClass;

// 1. Use 1 of anonymous inner class
public class AnonymousExample1 {
    public static void main(String[] args) {
        // Anonymous inner class that extends the parent class
        Parent ch1 = new Parent("Hi") {
            @Override
            void methodA() {
                System.out.println("Child version A");
            }

            @Override
            void methodB() {
                System.out.println("Child version B");
            }
        };

        // local inner class
        class Child extends Parent {
            Child() {
                super("Hi");
            }

            @Override
            void methodA() {
                System.out.println("Child version A");
            }

            @Override
            void methodB() {
                System.out.println("Child version B");
            }
        }

        Child ch = new Child();
    }
}

class Parent {
    String val;
    Parent(String v){this.val = v;}
    void methodA(){
        System.out.println("A");
    }
    void methodB(){
        System.out.println("B");
    }
}