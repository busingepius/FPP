/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 23/01/2024
 * Time : 11:14
 * Project Name : lecture5.section5
 */
package lecture5.section5;

public class Child extends Parent{
        int a;
        static int b;
        Child(int x,int a,int b){
            super(x);this.a = a;this.b = b;
            System.out.println("child constructor method");}

        {
            System.out.println("Child Instance Block A");
        }
        static {
            System.out.println("Child static block A");
        }
        static {
            System.out.println("Child static block B");
        }
        {
            System.out.println("Child Instance Block B");
        }

        static void childStaticMethod1(){
            System.out.println("Child Static method 1");}

        void childInstanceMethod1(){
            System.out.println("Child Instance method 1");
        }

        public int getA() {
            return a;
        }

        public static int getB() {
            return b;
        }

        public void setA(int a) {
            this.a = a;
        }

        public static void setB(int b) {
            Child.b = b;
        }


}
