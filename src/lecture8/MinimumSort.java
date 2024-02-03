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
import java.util.Objects;

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
        for (int k = i + 1; k <= j; k++) {
            if (arr[k] < min) {
                pos = k;
                min = arr[k];
            }
        }
        return pos;
    }

    public static void main(String[] args) {

        int[] a = new MinimumSort().arr;
        System.out.println(binarySearch(a, 23));
    }

    public static int binarySearch(int[] arr, int value) {
        int beg = 0;
        int end = arr.length - 1;
        while (beg <= end) {
            int middle = (beg + end) / 2;
            if (arr[middle] == value) {
                return arr[middle];
            } else if (arr[middle] < value) {
                beg = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
