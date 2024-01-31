/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 31/01/2024
 * Time : 14:54
 * Project Name : assignment9
 */
package assignment9;

public class LinkedStack {
    class Node{
        Object data;
        Node next;
        Node(Object data){
            this.data = data;
        }
    }

    Node head; // same as head
    int numberOfNodes;

    LinkedStack(){
        this.numberOfNodes = 0;
        head = new Node(0);
    }

    // add to the head -> add to the top
    public void push(Object data){
        addAtIndex(numberOfNodes,data);
    }


    // add at index
    public void addAtIndex(int index, Object data){
        if(index < numberOfNodes) index = 0;
        if(index > numberOfNodes)return;
        Node pred = head;

        for(int i = 0; i < index; i ++){
            pred = pred.next;
        }
        Node addNode = new Node(data);
        addNode.next = pred.next;
        pred.next = addNode;
        numberOfNodes++;
    }

    // delete at index
    public Object deleteAtIndex(int index){
        if(index < 0 || index > numberOfNodes){
            return null;
        }
        Node pred = head;
        for(int i = 0; i < index; i++){
            pred = pred.next;
        }
        Object item = pred.next.data;
        pred.next = pred.next.next;
        return item;
    }

    // get
    public Object get(int index){
        if(index < 0 )return null;
        if(index > numberOfNodes)return null;
        Node pred = head;
        for(int i = 0; i < index; i++){
            pred = pred.next;
        }
        return pred.data;
    }

    // pop
    public Object pop(){
        numberOfNodes--;
        return deleteAtIndex(numberOfNodes );
    }

    // peek
    public Object peek(){
        return get(numberOfNodes );
    }

    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(1);
        linkedStack.push(2);
        linkedStack.push(3);
        linkedStack.push(4);
        System.out.println(linkedStack.peek());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.peek());
        System.out.println("done");
    }
}
