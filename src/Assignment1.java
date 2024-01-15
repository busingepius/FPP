/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 15/01/2024
 * Time : 16:33
 * Project Name : fpp
 */

import java.util.Random;

public class Assignment1 {

    public static void main(String[] args) {

        String greet = "Hi \uD83D\uDC4B, my name is \"\u0180\u0075\u0073\u0069\u006E\u0067\u0065\"";
        System.out.println(greet);
        System.out.println(greet.length());// 27
        // the size is 27 because each character is one byte including the space apart from the emoji is two byte

        RandomNumbers random = new RandomNumbers();
        System.out.println(random.getRandom());

        if (random.getRandom() >= Byte.MIN_VALUE && random.getRandom() <= Byte.MAX_VALUE) {
            System.out.println("byte");
        } else if (random.getRandom() >= Short.MIN_VALUE && random.getRandom() <= Short.MAX_VALUE) {
            System.out.println("short");
        } else if (random.getRandom() >= Integer.MIN_VALUE && random.getRandom() <= Integer.MAX_VALUE) {
            System.out.println("integer");
        } else {
            System.out.println("long");
        }

    }


}

class RandomNumbers {
    private final Random random;

    public RandomNumbers() {
        random = new Random();
    }

    public long getRandom() {
        return (long) random.nextInt(Integer.MAX_VALUE) + random.nextInt(Integer.MAX_VALUE);
    }
}