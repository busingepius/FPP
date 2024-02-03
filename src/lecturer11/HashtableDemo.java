/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/02/2024
 * Time : 12:29
 * Project Name : lecturer11
 */
package lecturer11;

import java.util.Hashtable;
import java.util.Objects;
import java.util.Set;

public class HashtableDemo {
    public static void main(String[] args) {
        // value may be any collection
        Hashtable<Integer, Empl> tm = new Hashtable<Integer, Empl>();
        tm.put(1, new Empl(134, "Ranu", 3000));
        tm.put(5, new Empl(134, "Jony", 6000));
        tm.put(3, new Empl(134, "Crish", 2000));
        tm.put(14, new Empl(134, "Tom", 2400));

        System.out.println("Hashtable entries:");
        Set<Integer> keys = tm.keySet();
        for (Integer key : keys) {
            System.out.print(key + "==>" + tm.get(key));
        }
        tm.remove(4);
        tm.replace(5, new Empl(235, "Jony", 3200));
        System.out.println(tm);

    }
}

class Empl {
    private String name;
    private int salary;
    private int id;

    public Empl(int id, String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String toString() {
        return id + "\n" + name
                + "\n" + salary + "\n";
    }
}
