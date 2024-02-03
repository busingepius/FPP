/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/02/2024
 * Time : 16:27
 * Project Name : assignment12
 */
package assignment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Score {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in);) {
            while (true) {
                System.out.println("input a score 0 - 100%");
                int x = sc.nextInt();
                if(x < 0 || x > 100 ){
                    throw new UnsupportedOperationException("input range 0 - 100");
                }
            }
        } catch (InputMismatchException | UnsupportedOperationException exception) {
            System.out.println(exception);
        }
    }

}
