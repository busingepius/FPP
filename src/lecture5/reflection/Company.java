/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 23/01/2024
 * Time : 13:50
 * Project Name : lecture5.reflection
 */
package lecture5.reflection;

import java.util.Objects;

public class Company {
    private final String name;
    private int numOfEmployees;

    public Company(String name, int numOfEmployees) {
        this.name = name;
        this.numOfEmployees = numOfEmployees;
    }

    public String getName() {
        return name;
    }

    public int getNumOfEmployees() {
        return numOfEmployees;
    }

    public void setNumOfEmployees(int numOfEmployees) {
        this.numOfEmployees = numOfEmployees;
    }

    private static void internalRules() {
        System.out.println("This is the internal rules");
    }

    @Override
    public String toString() {
        return "Company{name = '"
                + name + "\'"
                + "numOfEmployees = '"
                + numOfEmployees + "\'"
                + "}";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numOfEmployees);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Company company = (Company) obj;
        return numOfEmployees == company.numOfEmployees
                &&
                Objects.equals(name, company.name);
    }
}
