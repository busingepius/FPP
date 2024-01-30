/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 29/01/2024
 * Time : 16:29
 * Project Name : assignment8
 */
package assignment8.problem1;

public class MyPersonList {
    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int numOfElements;

    public MyPersonList() {
        this.currentArray = new Person[INITIAL_LENGTH];
        this.numOfElements = 0;
    }

    // resize
    private void resize() {
        int newLen = currentArray.length * 2;
        Person[] temp = new Person[newLen];
        System.arraycopy(currentArray, 0, temp, 0, numOfElements);
    }

    // add elements in last
    public void add(Person person) {
        if (person == null) return;
        if (numOfElements == currentArray.length) {
            resize();
        }
        currentArray[numOfElements++] = person;
    }

    // get person
    public Person get(int index) {
        if (index < 0 || index >= numOfElements) return null;
        return currentArray[index];
    }

    // isEmpty
    public boolean isEmpty() {
        return numOfElements == 0;
    }

    // find
    public boolean find(Person person) {
        if (person == null) return false;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].getLast().equals(person.getLast())) {
                return true;
            }
        }
        return false;
    }

    // insert
    public void insert(Person person, int pos) {
        if (person == null) return;
        if (pos < 0 || pos >= numOfElements) {
            return;
        }
        if (numOfElements == currentArray.length) {
            resize();
        }
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = person;
        numOfElements++;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (pos + 1));
        currentArray = temp;
    }

    // remove
    public boolean remove(Person person) {
        if (isEmpty()) return false;
        if (person == null) return false;
        int index = -1;
        for (int i = 0; i < numOfElements; i++) {
            if (person.getLast().equals(currentArray[i].getLast())) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        numOfElements--;
        currentArray = temp;
        return true;
    }

    // toString
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < numOfElements - 1; i++) {
            sb.append(currentArray[i] + ", ");
        }
        sb.append(currentArray[numOfElements - 1] + "]");
        return sb.toString();
    }

    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        list.add(new Person("Biden", "Joe", 76));
        list.add(new Person("Yoweri", "Museveni", 83));
        list.add(new Person("Donald", "Trump", 90));
        list.insert(new Person("Hillary","Clinton",67), 2);
        list.remove(new Person("Biden", "Joe", 76));
        System.out.println(list.find(new Person("Hilary","Clinton",67)));
        System.out.println(list);
    }

}
