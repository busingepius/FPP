/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 24/01/2024
 * Time : 14:20
 * Project Name : lecture6.lambdaExpressions
 */
package lecture6.lambdaExpressions;

import java.util.Arrays;
import java.util.Comparator;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}

class personData {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Joe"),
                new Person("Bob"),
                new Person("Ann"),
        };

        Arrays.sort(people, new NameComparator());
        System.out.println(Arrays.toString(people));
    }
}