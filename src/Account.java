/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 11:17
 * Project Name : PACKAGE_NAME
 */

final public class Account {
    private final String name;
    private final int id;

    public Account(String name) {
        this(name,0);
    }
    public Account(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }


    public static void main(String[] args) {
        Account a1 = new Account("Businge");
        Account a2 = new Account("Pius",1);
    }

    // declare a class final so its not extended
    // make all fields private and final
    // don't provide setter methods
    // make all mutable fields final sso that its value can be assigned only once
    // initialize all the fields in the constructor performing deep copy
}
