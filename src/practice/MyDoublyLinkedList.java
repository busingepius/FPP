/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 30/01/2024
 * Time : 18:10
 * Project Name : practice
 */
package practice;

public class MyDoublyLinkedList {
    class ListNode {
        int value;
        ListNode prev;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    int numOfNodes;
    ListNode head;
    ListNode tail;

    MyDoublyLinkedList() {
        numOfNodes = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    //add at head
    public void addAtHead(int value) {
        ListNode pred, succ;
        pred = head;
        succ = head.next;
        ListNode addNode = new ListNode(value);
        addNode.next = succ;
        addNode.prev = pred;
        succ.prev = addNode;
        pred.next = addNode;
        numOfNodes++;
    }

    // add at tail
    public void addAtTail(int value) {
        //Head <- 1 <- 2 <- 3 <- Tail
        ListNode succ, pred;
        succ = tail;
        pred = tail.prev;
        ListNode addNode = new ListNode(value);
        addNode.next = succ;
        addNode.prev = pred;
        succ.prev = addNode;
        pred.next = addNode;
        numOfNodes++;
    }

    // add at index
    public void addAtIndex(int index, int value) {
        if (index > numOfNodes) return;
        if (index < 0) index = 0;
        ListNode pred;
        ListNode succ;
        if (index < numOfNodes - index) {
            // Head -> 1 -> 2 -> 3 -> Tail
            pred = head;
            for (int i = 0; i < index; i++) {
                pred = pred.next;
            }
            succ = pred.next;
        } else {
            //Head <- 1 <- 2 <- 3 <- Tail
            succ = tail;
            for (int i = 0; i < numOfNodes - index; i++) {
                succ = succ.next;
            }
            pred = succ.prev;
        }
        ListNode addNode = new ListNode(value);
        addNode.next = succ;
        addNode.prev = pred;
        pred.next = addNode;
        succ.prev = addNode;
        numOfNodes++;
    }

    // delete at index
    public void deleteAtIndex(int index) {
        if (index < 0) return;
        if (index >= numOfNodes) return;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }

        ListNode succ = pred.next.next;
        pred.next = succ;
        succ.prev = pred;
        numOfNodes--;
    }
}
