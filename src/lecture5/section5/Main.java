/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 23/01/2024
 * Time : 10:53
 * Project Name : lecture5.section5
 */
package lecture5.section5;

public class Main {
    public static void main(String[] args) {
        Child ch = new Child(1,2,3);
        System.out.println("-".repeat(30));
        Child ch2 = new Child(4,5,6);
    }
    /** ORDER OF EXECUTION OF THE INHERITANCE
     * 1. Parent class static variables
     * 2. Parent class static block
     * 3. Child class static variables
     * 4. Child class static block
     * 5. Parent class instance variables
     * 6, Parent class instance blocks
     * 7, Parent class constructor(relevant)
     * 8. Child class instance variables
     * 9. Child class instance block
     * 10. Child class constructor(relevant)
     */
}
