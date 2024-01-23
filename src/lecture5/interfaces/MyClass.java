/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 23/01/2024
 * Time : 12:06
 * Project Name : lecture5.interfaces
 */
package lecture5.interfaces;

public class MyClass implements MyInterface{
    @Override
    public void myAbstractMethod(){
        MyInterface.staticMethodInterface();
        myMethodWithBody();
        System.out.println("My Implementation");
    }
}
