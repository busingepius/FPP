/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 20/01/2024
 * Time : 20:16
 * Project Name : assignment4
 */
package assignment4;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(sumOfArray(new int[]{1,2,3,4},0));
    }
    public static int sumOfArray(int[] array, int currentIndex){
        if(currentIndex == array.length || currentIndex > array.length){
            return 0;
        }


        return array[currentIndex] + sumOfArray(array, currentIndex+1);

    }
}
