/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 10:41
 * Project Name : lecture6.memberInnerClass
 */
package lecture6.memberInnerClass;

public class MyClass {
    private String s = "hello";

    public static void main(String[] args) {
        new MyClass();
    }

    MyClass() {
        MyInnerClass myInnerClass = new MyInnerClass();
        System.out.println(myInnerClass.interval);
        myInnerClass.innerMethod();
    }

    private class MyInnerClass {
        private int interval = 3;

        private void innerMethod() {
            System.out.println(s);
        }
    }
}
