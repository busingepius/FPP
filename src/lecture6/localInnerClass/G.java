/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 11:53
 * Project Name : lecture6.localInnerClass
 */
package lecture6.localInnerClass;

public class G {
    int a = 12;
    public void method(final int x){
        // local variable x and z must be final or effectively final
        // cannot change the values of the LOCAL variables that are used in the local inner class
        int z = 10; // effectively final
        int y = 40;
        y = 50;
        // local inner class
        class H{
            H(){
                System.out.println(a);
                a = 10;
                System.out.println(z);
                System.out.println(x);
            }
        }
    }
}
