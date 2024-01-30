/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 29/01/2024
 * Time : 16:24
 * Project Name : assignment8
 */
package assignment8.problem1;

public class Person {
    private String lastName;
    private String firstName;
    private int age;

    public Person(String last, String first, int a) {
        this.lastName = last;
        this.firstName = first;
        this.age = a;
    }

    public String getLast(){
        return lastName;
    }

    @Override
    public String toString(){
        return "Person[lastName="+lastName+"\n FirstName="+firstName+"\nAge="+age+"]";
    }
}
