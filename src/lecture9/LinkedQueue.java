/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 31/01/2024
 * Time : 10:55
 * Project Name : lecture9
 */
package lecture9;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedQueue {
    class Node {
        Object data;
        Node next;

        Node(Object item) {
            data = item;
        }
    }

    Node front, rear;
    int count;

    // enqueue
    public void enqueue(Object item) {
        Node p = new Node(item);
        if (front == null) { // if empty
            front = rear = p;
            front.next = null;
        } else if (front == rear) { // if only one element
            rear = p;
            front.next = rear;
            rear.next = null;
        } else { // otherwise has many elements
            rear.next = p;
            rear = p;
            rear.next = null;
        }
        count++;
    }

    // dequeue
    public Object dequeue() {
        if (front == null) return null;
        Object item = front.data;
        front = front.next;
        // decrement queue size new
        count--;
        return item;
    }

    // is empty
    public boolean isEmpty() {
        return front == null;
    }

    // peek
    public Object peek(){return front.data;}

    // size
    public int size(){return count;}

    // display
    public void display(){
        Node p = front;
        System.out.println("Linked Q: ");
        if(p == null) System.out.println("empty");
        while(p != null){
            System.out.println(p.data + " ");
            p = p.next ;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedQueue q = new LinkedQueue();
        q.display();
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        q.enqueue("D");
        q.display();
        System.out.println("Remove(): "+q.dequeue());
        q.display();
        System.out.println("Peek(): "+q.peek());

        Queue<Integer> qq = new LinkedList<Integer>();
        qq.add(42);
        qq.add(-3);
        qq.add(17);
        System.out.println(qq.remove());

        // important: when constructing a queue you must use a new Linkedlist instead of a new queue.
        // Queue is an interface
    }
}
