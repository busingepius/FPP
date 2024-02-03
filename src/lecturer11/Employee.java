package lecturer11;

import java.util.HashMap;

public class Employee {
    private String firstName;
    private String lastName;
    private HashMap<String, Double> salaryRecord = new HashMap();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addEntry(String date, double salary) {
        salaryRecord.put(date, salary);
    }

    public void printPaymentAmount(String date) {
        Double salaryObject = salaryRecord.get(date);
        if (salaryObject == null) {
            System.out.println(firstName + " " + lastName + " did not receive a paycheck on " + date);

        } else {
            System.out.println(firstName + " " + lastName + " was paid " + salaryObject + " on " + date);
        }

    }

    public void printAveragePaycheck() {

        double accum = 0.0;
        int count = 0;
        // Method 1
        for (String ob : salaryRecord.keySet()) {
            double sal = salaryRecord.get(ob);
            accum += sal;
            ++count;
        }

        // Method 2
	/*	Iterator it = salaryRecord.keySet().iterator();
		
		while(it.hasNext()){
			String nextDate = (String)it.next(); // Getting the Key
			Double sal = salaryRecord.get(nextDate); // Retrieving the value using key
			accum += sal;
			++count;
		}*/
        System.out.println("Average paycheck for " + firstName + " " + lastName + " was " + accum / count);
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salaryRecord=" + salaryRecord + "]";
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setFirstName("Jim");
        e.setLastName("Jones");
        for (int i = 0; i < 12; ++i) {
            e.addEntry(i + "/15/2011", 3070 + 5 * i);
        }
        System.out.println(e);
        e.printPaymentAmount("3/15/2011");
        e.printPaymentAmount("5/15/2010");
        e.printAveragePaycheck();

    }

}
