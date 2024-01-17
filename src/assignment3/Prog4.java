/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 16/01/2024
 * Time : 16:03
 * Project Name : assignment2
 */
package assignment3;

public class Prog4 {
    public static void main(String[] args) {
        float f1 = 1.27f;
        float f2 = 3.881f;
        float f3 = 9.6f;

        int intSum = (int)(f1 + f2 +f3);
        System.out.println(intSum);
        int roundSum = (int)Math.round(f1+f2+f3);
        System.out.println(roundSum);
    }

}
