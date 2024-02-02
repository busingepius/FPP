package lectures;

/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 19/01/2024
 * Time : 14:11
 * Project Name : PACKAGE_NAME
 */

public class Operation {
    int data = 50;

    void change(int data) {
        data = data + 100;
    }

    //    call by value
    void change(Operation op) {
        op.data = op.data + 100;
    }

    public static void main(String[] args) {
        Operation op = new Operation();
        System.out.println("before change " + op.data);
//        op.change(500);
        op.change(op);
        System.out.println("before change " + op.data);
//    call by reference

    }

}
