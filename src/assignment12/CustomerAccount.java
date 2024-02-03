/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 03/02/2024
 * Time : 16:03
 * Project Name : assignment12
 */
package assignment12;

public class CustomerAccount {
    private String cus_name;
    private int acc_no;
    private double balance;

    public CustomerAccount(String cus_name, int acc_no, double balance) {
        this.cus_name = cus_name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        boolean withdrew = false;
        try {
            if (amount > balance) {
                withdrew = false;
                throw new UserException("with draw amount exceeds the balance");
            }
            if ((balance - amount) < 100) {
                withdrew = false;
                throw new UserException("balance reach below $100");
            }
            balance -= amount;
            withdrew = true;
        } catch (UserException x) {
            System.out.println(x.getMessage());
        } finally {
            return withdrew;
        }
    }

    public boolean deposit(double amount) {

        boolean deposited = false;
        try {
            if (amount < 0) {
                throw new UserException("negative inputs not allowed");
            }
            balance += amount;
        } catch (UserException x) {
            System.out.println(x.getMessage());
        } finally {
            return deposited;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        CustomerAccount customerAccount = new CustomerAccount("pius",123,210_000);
        System.out.println(customerAccount.deposit(-12));
    }
}

class UserException extends Exception {
    public UserException(String message) {
        super(message);
    }
}