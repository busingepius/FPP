/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 22/01/2024
 * Time : 17:07
 * Project Name : assignment5
 */
package assignment5.problem2;

import java.time.LocalDate;
import java.util.Scanner;

class DeptEmployee {
    private String name;
    private double salary;
    private final LocalDate hireDate;


    public DeptEmployee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public double computeSalary() {
        return salary;
    }
}

class Professor extends DeptEmployee {

    private int numberOfPublications;

    public Professor(String name, double salary, LocalDate hireDate, int numberOfPublications) {
        super(name, salary, hireDate);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }

}

class Secretary extends DeptEmployee {

    double overtimeHours;

    public Secretary(String name, double salary, LocalDate hireDate, double overtimeHours) {
        super(name, salary, hireDate);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (12 * overtimeHours);
    }
}

 class Main{
    public static void main(String[] args) {
        Professor pro1 = new Professor("Tom",111111,LocalDate.now(),1);
        Professor pro2 = new Professor("Tim",222222,LocalDate.now(),2);
        Professor pro3 = new Professor("Tem",333333,LocalDate.now(),3);
        Secretary sec1 = new Secretary("Betty",50000,LocalDate.now(),23);
        Secretary sec2 = new Secretary("Dotty",70000,LocalDate.now(),8);
        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = pro1;
        department[1] = pro2;
        department[2] = pro3;
        department[3] = sec1;
        department[4] = sec2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Type Y to see the total salary");
        int total = 0;
        if (sc.nextLine().equals("Y")){
            for (DeptEmployee employee:department){
                total += employee.computeSalary();
            }
            System.out.println("Total salary: "+total);
        }

    }
}