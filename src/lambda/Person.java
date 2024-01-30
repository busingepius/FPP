/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 25/01/2024
 * Time : 08:42
 * Project Name : lambda
 */
package lambda;

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

    @Override
    public String toString() {
        return "Person{ name: " + name + " }";
    }

    /**NESTED STATIC CLASS*/
    static class NameComparator implements Comparator<Person>{
        @Override
        public int compare(Person p1, Person p2){
            return p1.getName().compareTo(p2.getName());
        }
    }

    /**
     * LOCAL INNER CLASS
     *public Person[] sort(Person[] persons){
     *   class NameComparator implements Comparator<Person> {
     *      @Override
     *      public int compare(Person p1, Person p2) {
     *          return p1.getName().compareTo(p2.getName());
     *      }
     *  }
     *  Arrays.sort(persons,new NameComparator());
     *  return persons;
     *}
     */

    /**
     * MEMBER INNER CLASS
     * class NameComparator implements Comparator<Person> {
     * @Override
     * public int compare(Person p1, Person p2) {
     * return p1.getName().compareTo(p1.getName());
     *  }
     *  }
     */

}


class Main {
    public static void main(String[] args) {
        Person[] persons = {new Person("Joe"), new Person("Bob"), new Person("Anne")};
        /**
         * MEMBER CLASS
         * Arrays.sort(persons, new Person("").new NameComparator());
         * System.out.println(Arrays.toString(persons));
         */

        /**
         * LOCAL INNER CLASS
         * System.out.println(Arrays.toString(new Person("").sort(persons)));
         */

        Arrays.sort(persons, new Person.NameComparator());
    }
}
