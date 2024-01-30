/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 29/01/2024
 * Time : 11:43
 * Project Name : lecture8
 */
package lecture8;

public class MyStringList {
    private final int INITIAL_LENGTH = 4;
    private String[] currentArray;
    private int numOfElements;

    public MyStringList() {
        currentArray = new String[INITIAL_LENGTH];
        numOfElements = 0;
    }

    // add element in last
    public void add(String s) {
        if (s == null) return;
        if (numOfElements == currentArray.length) {
            resize();
        }
        // currentArray[numOfElements++] = s;
        currentArray[numOfElements] = s;
        numOfElements = numOfElements + 1;
    }

    // get
    public String get(int i) {
        if (i < 0 || i >= numOfElements) {
            return null;
        }
        return currentArray[i];
    }

    // isEmpty
    public boolean isEmpty() {
        return numOfElements == 0;
    }

    // find
    public boolean find(String s) {
        if (s == null) return false;
        for (int i = 0; i < numOfElements; i++) {
            if (currentArray[i].equals(s)) {
                return true;
            }
        }
        return false; // the element is not in the list
    }

    // insert
    public void insert(String s, int pos) {
        if (pos < 0 || pos > numOfElements) {
            return;
        }
        if (numOfElements == currentArray.length) {
            resize();
        }
        String[] temp = new String[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = s;
        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - (pos + 1));
        currentArray = temp;
        numOfElements++;
    }

    // remove
    public boolean remove(String s) {
        if (numOfElements == 0) return false;
        if (s == null) return false;
        int index = -1;
        for (int i = 0; i < numOfElements; ++i) {
            if (currentArray[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false; // s is not in the list
        String[] temp = new String[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1,
                temp, index,
                currentArray
                        .length - (index + 1));
        currentArray = temp;
        --numOfElements;
        return true;
    }

    // resize
    private void resize() {
        System.out.println("resizing");
        int len = currentArray.length;
        int newLen = 2 * len;
        String[] newArray = new String[newLen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;
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
        MyStringList list = new MyStringList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.insert("E", 4);
//        System.out.println("At index 3: "+list.get(3));
//        list.remove("D");
        System.out.println(list.find("c"));
        System.out.println(list);
    }
}
