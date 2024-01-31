/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 30/01/2024
 * Time : 11:50
 * Project Name : lecture9
 */
package lecture9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }

    }

    int size;
    ListNode head;

    MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    // add
    public void addAtIndex(int index, int value) {
        if (index > size) return;
        if (index < 0) {
            index = 0;
        }
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode addAt = new ListNode(value);
        addAt.next = pred.next;
        pred.next = addAt;
        size++;
    }

    // get
    public int get(int index) {
        if (index < 0 || index >= size) return -1;
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.next.value;
    }

    //add at head
    public void addAtHead(int value) {
        addAtIndex(0, value);
    }

    // add at tail
    public void addAtTail(int value) {
        addAtIndex(size, value);
    }

    // delete at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
        size--;
    }

    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.addAtHead(800);
        l.addAtHead(300);
        l.addAtTail(900);
        l.addAtIndex(1, 200);
        System.out.println(l.get(1));
        System.out.println("done");
        l.deleteAtIndex(2);

        List<String> myLinkedList = new LinkedList<>(
                Arrays.asList("apple","orange","mango")
        );

        Iterator<String> iterator = myLinkedList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        myLinkedList.forEach(val-> System.out.println(val));
    }

}
