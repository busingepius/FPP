/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 02/02/2024
 * Time : 11:46
 * Project Name : lecturer11
 */
package lecturer11;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashtable {

    public class Entry {
        private Object key;
        private Object value;

        Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return key.toString() + "->" + value.toString();
        }
    }

    private int numberOfElements;
    private static final int INITIAL_SIZE = 19;
    private int tableSize;
    // to avoid collision with same index, every index is implementef
    private LinkedList[] table;

    public MyHashtable() {
        this(INITIAL_SIZE);
    }

    public MyHashtable(int tableSize) {
        this.tableSize = tableSize;
        table = new LinkedList[tableSize];
        numberOfElements = 0;
    }

    // hash function
    public int hash(int bigNum) {
        // use Math.abs to convert negtive to positive to do modulo on them
        bigNum = Math.abs(bigNum);
        return bigNum % tableSize;
    }


    // first try
    public void put(Object key, Object value) {
        // disallow null keys
        if (key == null) {
            return;
        }

        // get the "big" integer corresponding to the obj
        // assumes key is not null
        int hashcode = key.hashCode();
        // compress down to a table slot
        int hashValue = hash(hashcode);
        // create the entry
        Entry e = new Entry(key, value);


//        //////////////////////TRYING NEW SHIRT//////////////////////////////////////////////////
//        if (table[hashValue] == null) {
////                table[hashValue] = new LinkedList();
////            }
////            table[hashValue].add(e);
////            numberOfElements++;
//        for (Iterator it = table[hashValue].iterator(); it.hasNext(); ) {
//            e = (Entry) it.next();
//            if (e.key.equals(key)) {
//                return e.value;
//            }
//        }
//        //////////////////////END OF TRYING NEW SHIRT///////////////////////////////////////////


        boolean keyAlreadyInUse = false;
        if (table[hashValue] != null) {
            for (Object ob : table[hashValue]) {
                Entry ent = (Entry) ob;
                if (ent.key.equals(key)) {
                    keyAlreadyInUse = true;
                    ent.value = value; // update value for the key value pair
                }
            }
        }

        // we handle case keyAlreadyInUse = true in loop
        if (!keyAlreadyInUse) {
            // now place it in the table
            if (table[hashValue] == null) {
                table[hashValue] = new LinkedList();
            }
            table[hashValue].add(e);
            numberOfElements++;
        }

    }

    public Object get(Object key) {
        // null key not allowed
        if (key == null) return null;
        // get the "big" integer corresponding to the object
        int hashcode = key.hashCode();
        //compress down to a table slot
        int hashValue = hash(hashcode);
        // if slot given by hash not yet in use, return null
        if (table[hashValue] == null) {
            return null;
        }

        // now look for the desired Entry, each index us a linkedlist,
        // so Iterator is used to retrieve the correct match
        Entry e = null;
        for (Iterator it = table[hashValue].iterator(); it.hasNext(); ) {
            e = (Entry) it.next();
            if (e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }

    // size
    public int size() {
        return numberOfElements;
    }

    //isEmpty
    public boolean isEmpty() {
        return numberOfElements == 0;
    }


    public String toString() {
        String n = System.getProperty("Line.separator");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                sb.append("Index[" + i + "]" + " ");
                Entry next = null;
                for (Iterator it = table[i].iterator(); it.hasNext(); ) {
                    next = (Entry) it.next();
                    if (next.value != null) {
                        sb.append(next + n);
                    } else {
                        sb.append(next.key + "->null" + n);
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        MyHashtable myHashtable = new MyHashtable();
        myHashtable.put("CS390",0);
        myHashtable.put("CS392",1);
        System.out.println(myHashtable.get("CS390"));
    }
}
