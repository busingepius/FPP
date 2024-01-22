/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 22/01/2024
 * Time : 10:36
 * Project Name : lecture5
 */
package lecture5;

public class Manager extends Employee{
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b){bonus = b;}
    public double getBonus(){return bonus;}
}
