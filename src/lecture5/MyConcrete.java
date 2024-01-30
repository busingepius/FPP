/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 22/01/2024
 * Time : 13:49
 * Project Name : lecture5
 */
package lecture5;

final public class MyConcrete extends MyAbstract{
    MyConcrete(int value){
        super(value);
    }

    @Override
    public final void abstractMethod(){
        System.out.println("Implementation of the abstract method");
    }

    public static void main(String[] args) {
        MyConcrete.staticMethod();
        MyConcrete myConcrete = new MyConcrete(12);
        myConcrete.instanceMethod();
    }
}
