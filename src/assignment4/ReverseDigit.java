/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 20/01/2024
 * Time : 20:05
 * Project Name : assignment4
 */
package assignment4;

public class ReverseDigit {
    public static void main(String[] args) {
        reverseDigits(720);
    }

    public static void reverseDigits(int number) {
        if (number <= 0) {
            return;
        }
        System.out.println(number % 10);
        reverseDigits(number / 10);
    }
}
