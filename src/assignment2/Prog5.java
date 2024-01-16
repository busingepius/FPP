/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 16/01/2024
 * Time : 15:58
 * Project Name : assignment2
 */
package assignment2;

import java.util.Arrays;

public class Prog5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Prog5().combine(new int[]{5,6,-4,3,1},new int[]{5,6,-4,3,1})));
    }
    public int[] combine(int[] a, int[] b){
        int[] newA = new int[a.length + b.length];
        int count = 0;
        for (int item: a){
            newA[count++] = item;
        }
        for (int item: b){
            newA[count++] = item;
        }
        return newA;
    }
}
