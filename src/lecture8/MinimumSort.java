/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 29/01/2024
 * Time : 14:01
 * Project Name : lecture8
 */
package lecture8;

import java.util.Arrays;

public class MinimumSort {
    int[] arr;

    MinimumSort() {
        arr = new int[]{5, 4, 3, 1, 6, 7};
        sort();
    }


    public void sort() {

        if (arr == null || arr.length <= 1) return;
        int len = arr.length;
        for (int i = 0; i < len; ++i) {
            //find position of min value from arr[i] to arr[len - 1]
            int nextMinPos = minpos(i, len - 1);
            // place this min value at position i
            swap(i, nextMinPos);
        }
    }

    // swaps value arr[i], arr[j][
    void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // returns pos of min value from positions i to j
    int minpos(int i, int j) {
        int pos = i;
        int min = arr[i];
        for (int k = i + 1; k < j; k++) {
            if (arr[k] < min) {
                pos = k;
                min = arr[k];
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MinimumSort().arr));
    }
}
