/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 19/01/2024
 * Time : 16:01
 * Project Name : assignment3b
 */
package assignment3b.questionOne;

public class Singleton {
    private static Singleton instanceOne = null;
    private static Singleton instanceTwo = null;
    private static Singleton instanceThree = null;

    private Singleton() {
       instanceOne =  new Singleton();
       instanceTwo =  new Singleton();
       instanceThree =  new Singleton();
    }

    public static Singleton getInstanceOne() {
        if(instanceOne == null){
            instanceOne = new Singleton();
        }
        return instanceOne;
    }
    public static Singleton getInstanceTwo() {
        if(instanceTwo == null){
            instanceTwo = new Singleton();
        }
        return instanceTwo;
    }public static Singleton getInstanceThree() {
        if(instanceThree == null){
            instanceThree = new Singleton();
        }
        return instanceThree;
    }
}
