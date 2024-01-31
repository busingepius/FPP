/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 30/01/2024
 * Time : 15:04
 * Project Name : lecture9
 */
package lecture9;

public class MyDoublyLinkedList {
    public class ListNode {
        int val;
        ListNode prev;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    int numberOfNodes;
    ListNode tail;
    ListNode head;

    MyDoublyLinkedList() {
        numberOfNodes = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    // add at head
    public void addAtHead(int value) {
        ListNode pred = head;
        ListNode succ = head.next;
        ListNode toAdd = new ListNode(value);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        ++numberOfNodes;
    }

    // add at tail
    public void addAtTail(int value) {
        ListNode succ = tail;
        ListNode pred = tail.prev;
        ListNode toAdd = new ListNode(value);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        ++numberOfNodes;
    }

    // add at index
    public void addAtIndex(int index, int value) {
        if (index > numberOfNodes) return;
        if (index < 0) {
            index = 0;
        }

        ListNode pred, succ;
        if (index < numberOfNodes - index) {
            // Head -> 1 -> 2 -> 3 -> Tail
            pred = head;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            succ = pred.next;
        } else {
            //Head <- 1 <- 2 <- 3 <- Tail
            succ = tail;
            for (int i = 0; i < numberOfNodes - index; i++) {
                succ = succ.prev;
            }
            pred = succ.prev;
        }

        ListNode toAdd = new ListNode(value);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
        ++numberOfNodes;
    }

    // delete at index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= numberOfNodes) return;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode succ = pred.next.next;
        pred.next = succ;
        succ.prev = pred;
        --numberOfNodes;
    }

    // get
    public int get(int index) {
        if (index < 0 || index >= numberOfNodes) return -1;
        ListNode curr = head;
        if (index + 1 < numberOfNodes - index) {
            for (int i = 0; i < index + 1; i++) {
                curr = curr.next;
            }
        } else {
            curr = tail;
            for (int i = 0; i < numberOfNodes - index; i++) {
                curr = curr.prev;
            }
        }
        return curr.val;
    }

    public static void main(String[] args) {
        MyDoublyLinkedList list = new MyDoublyLinkedList();
        list.addAtHead(9);
        list.deleteAtIndex(0);
        list.addAtTail(4);
        System.out.println("At index 1: " + list.get(0));
        list.addAtHead(2);
        list.addAtTail(5);
        list.addAtIndex(2, 8);
        list.deleteAtIndex(2);
        /////////////////////////////
        for (int i = 0; i < list.numberOfNodes; i++) {
            System.out.println(" - " + list.get(i) + " - ");
        }
    }


}
