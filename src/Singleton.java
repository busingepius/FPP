/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 19/01/2024
 * Time : 14:59
 * Project Name : PACKAGE_NAME
 */

public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
