/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 11:03
 * Project Name : lecture6
 */
package lecture6.memberInnerClass;

public class C {
    public static void main(String[] args) {
        // 1.
        A a = new A();
        A.B b = a.new B();

        // 2.
        A.B bb = new A().new B();

    }
}
