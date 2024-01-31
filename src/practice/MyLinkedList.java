/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 30/01/2024
 * Time : 16:40
 * Project Name : practice
 */
package practice;

import lecture9.MyDoublyLinkedList;

public class MyLinkedList {
    class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    int numOfNodes;
    ListNode head;

    MyLinkedList() {
        numOfNodes = 0;
        head = new ListNode(0);
    }

    // add at index
    public void addAtIndex(int index, int value) {
        if (index > numOfNodes) return;
        if (index < 0) index = -1;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode addNode = new ListNode(value);
        addNode.next = pred.next;
        pred.next = addNode;
        numOfNodes++;
    }

    // add at head
    public void addAtHead(int value) {
        addAtIndex(0, value);
    }

    // add at tail
    public void addAtTail(int value) {
        addAtIndex(numOfNodes, value);
    }

    // get
    public int get(int index) {
        if (index >= numOfNodes) return -1;
        if (index < 0) return -1;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        return pred.next.value;
    }

    // delete at
    public void deleteAtIndex(int index) {
        if (index < 0) return;
        if (index >= numOfNodes) return;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
        numOfNodes--;
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtHead(2);
        myLinkedList.addAtTail(148);
        myLinkedList.addAtHead(1);
        myLinkedList.addAtHead(14);
        System.out.println(myLinkedList.get(-10));
        System.out.println(myLinkedList);
    }

}
