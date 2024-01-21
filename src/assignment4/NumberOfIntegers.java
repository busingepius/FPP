/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 20/01/2024
 * Time : 20:15
 * Project Name : assignment4
 */
package assignment4;

public class NumberOfIntegers {
    public static void main(String[] args) {
        System.out.println(numberOfIntegers(100345));
    }

    public static int numberOfIntegers(int n) {
        if (n <= 0) {
            return 0;
        }

        return 1 + numberOfIntegers(n / 10);
    }
}
