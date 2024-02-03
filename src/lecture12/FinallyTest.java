/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/02/2024
 * Time : 11:23
 * Project Name : lecture12
 */
package lecture12;

public class FinallyTest {
    public static void test() throws Exception {
        try {
            System.out.println("Inside test.");
//             return; // shifts execution to the finally block only
            // System.exit(0);
            throw new Exception("first"); // terminates execution of the application
        } catch (Exception x) {
            System.out.println(x.getMessage());
             throw new Exception("second");
        } finally {
            //System.exit(0); // terminates execution of the application
            System.out.println("finally");
        }
         // System.out.println("last statement"); // not reached if finally is executed
        // System.exit(0);
    }

    public static void main(String[] args) {
        try{
            System.out.println("Hi");
            test();
        }
        catch(Exception x){
            System.out.println("Inside main method: "+x.getMessage());
        }
        System.out.println("END");
    }
}
