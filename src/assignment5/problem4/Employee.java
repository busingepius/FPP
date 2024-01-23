/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 22/01/2024
 * Time : 17:37
 * Project Name : assignment5.problem4
 */
package assignment5.problem4;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double getPayment();

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}

class HourlyEmployee extends  Employee{
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }


    @Override
    public double getPayment() {
        return wage * hours;
    }
}

class SalariedEmployee extends Employee{
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPayment() {
        return weeklySalary;
    }
}

class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double getPayment() {
        return grossSales*(commissionRate / 100);
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPayment() {
        return baseSalary+ (super.getPayment());
    }
}

class Main{
    public static void main(String[] args) {
       var e1 = new CommissionEmployee("Elon1","Musk1","1001",100011,10);
       var e2 = new CommissionEmployee("Elon2","Musk2","1002",100012,11);
       var e3 = new CommissionEmployee("Elon3","Musk3","1003",100013,12);
       var e4 = new CommissionEmployee("Elon4","Musk4","1004",100014,13);
       var e5 = new CommissionEmployee("Elon5","Musk5","1005",100015,14);

       Employee[] employees = new Employee[5];
       employees[0] = e1;employees[1] = e2;employees[2] = e3;employees[3] = e4;employees[4] = e5;
       int total = 0;
       for(Employee employee:employees){
           total += employee.getPayment();
       }
        System.out.println(total);
    }
}
