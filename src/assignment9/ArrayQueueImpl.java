/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 31/01/2024
 * Time : 14:14
 * Project Name : assignment9
 */
package assignment9;

public class ArrayQueueImpl {
    private int[] arr = new int[10];
    private int front = -1;
    private int rear = 0;

    //implement
    public int peek() {
        if (rear == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[front];
    }

    //implement
    public void enqueue(int obj) {
        resize();
        if (front == -1) {
            arr[rear++] = obj;
            front++;
            return;
        }
        arr[rear++] = obj;
    }

    //implement
    public int dequeue() {

        if (rear == 0) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int item = arr[front];
        if (rear == 1) {
            front = -1;
        } else {
            front++;
        }
        rear--;
        return item;
    }

    //implement
    public boolean isEmpty() {
        return rear == 0;
    }

    //implement
    public int size() {
        return rear;
    }

    private void resize() {
        if (rear == arr.length) {
            int newLen = arr.length * 2;
            int[] temp = new int[newLen];
            System.arraycopy(arr, 0, temp, 0, rear);
            arr = temp;
        }
    }
}

class Main {
    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);

        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        arrayQueue.enqueue(11);
        arrayQueue.enqueue(22);
        arrayQueue.enqueue(33);
        arrayQueue.enqueue(44);
        arrayQueue.enqueue(55);
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.dequeue());
        System.out.println("done");
    }
}