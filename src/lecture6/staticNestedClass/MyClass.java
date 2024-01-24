/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 11:19
 * Project Name : lecture6.staticNestedClass
 */
package lecture6.staticNestedClass;

public class MyClass {
    private String s = "hello";
    public static void main(String[] args){
        new MyClass();
    }

    MyClass(){
        // access static methods in the usual way
        MyStaticNestedClass.myStaticMethod();
        // access instance methods in the usual way too
        // except that now private methods are also accessible
        MyStaticNestedClass cl = new MyStaticNestedClass();
        cl.myOtherMethod();
        // as with inner classes, private instance variables are accessible
        int y = cl.x;
    }

    static class MyStaticNestedClass{
        private int x = 0;
        static void myStaticMethod(){
             String t = new MyClass().s;
            // compiler error -- no access
            // String t = s;
        }

        private void myOtherMethod(){}
    }
}


class AnotherClass{
    public static void main(String[] args) {
        MyClass.MyStaticNestedClass cl = new MyClass.MyStaticNestedClass();
        MyClass m = new MyClass();
        // the following is illegal  -- compiler error
        // MyClass.MyStaticNestedClass n = m. new MyStaticNestedClass()
    }
}