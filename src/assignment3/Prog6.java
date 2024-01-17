/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 16/01/2024
 * Time : 15:53
 * Project Name : assignment2
 */
package assignment3;


public class Prog6 {
    public static void main(String[] args) {
        System.out.println(min(new int[]{2,-21,3,45,0,12,18,6,3,1,0,-22}));
    }
     static int min(int[] arrayOfInts){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arrayOfInts.length; i++){
            if(arrayOfInts[i] < min){
                min = arrayOfInts[i];
            }
        }
        return min;
    }
}
