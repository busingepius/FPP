/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 18/01/2024
 * Time : 18:15
 * Project Name : assignment3_2.problem1
 */
package assignment3_2.problem1;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("1000Nth", "Fairfield", "Iowa", "525567");
        Address address2 = new Address("1000Nth", "Chicago", "Las Vega", "525589");
        Address address3 = new Address("1000Nth", "Washington", "Utta", "5252317");
        Customer customer1 = new Customer("Joe", "Smith", "332-221-4444");
        customer1.setBillingAddress(address1);
        customer1.setShippingAddress(address1);
        Customer customer2 = new Customer("Doe", "Salsa", "332-221-4445");
        customer2.setBillingAddress(address2);
        customer2.setShippingAddress(address2);
        Customer customer3 = new Customer("Boe", "Biden", "332-221-4446");
        customer3.setBillingAddress(address3);
        customer3.setShippingAddress(address3);
        Customer[] cA = new Customer[3];
        cA[0] = customer1;
        cA[1] = customer2;
        cA[2] = customer3;
        for (Customer c : cA) {
            if (c.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(c);
            }
        }


    }
}
