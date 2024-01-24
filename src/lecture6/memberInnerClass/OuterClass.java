/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 10:47
 * Project Name : lecture6.memberInnerClass
 */
package lecture6.memberInnerClass;

public class OuterClass {
    MyInnerClass inner;
    private String param;

    OuterClass(String param) {
        inner = new MyInnerClass("innerStr");
        this.param = param; // the outer class version of this
    }

    void outerMethod() {
        System.out.println(inner.innerParam);
        inner.innerMethod();
        /**
         * String t = inner.this.innerParam;
         * compiler error
         * because the outer class can not access the this of inner class
         */

    }

    class MyInnerClass {
        private String innerParam;

        MyInnerClass(String innerParam) {
            // the inner class version of 'this'
            this.innerParam = innerParam;
        }

        void innerMethod() {
            // accessing enclosing class's version of this
            System.out.println(OuterClass.this.param);
            // same as the following
            System.out.println(param);
        }
    }

    public static void main(String[] args) {
        (new OuterClass("outerStr")).outerMethod();
    }
}
