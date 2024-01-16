/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 16/01/2024
 * Time : 16:09
 * Project Name : assignment2
 */
package assignment2;

import java.util.Arrays;

public class RemoveDups {
    public static void main(String[] args) {
        String[] array = {"horse", "dog", "cat", "horse", "dog"};
        int countDups = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    countDups++;
                }
            }
        }
        String[] arr = new String[array.length - countDups];

        int index = 0;
        for (int i = 0; i < array.length; i++) {
            countDups = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    countDups++;
                    break;
                }
            }
            if (countDups == 0) arr[index++] = array[i];
        }
        System.out.println(Arrays.toString(arr));

    }

}
