/**
 * Created by: Businge Pius
 * Company : Gegabox
 * Year : 2024
 * Date : 31/01/2024
 * Time : 10:18
 * Project Name : lecture9
 */
package lecture9;

import java.util.Stack;

public class ArrayStack {
    private Object a[];
    private int top;

    public ArrayStack(int n) {
        top = -1;
        a = new Object[n];
    }

    // push -> add item to top of the stack
    public void push(Object item) {
        if (top == a.length - 1) System.out.println("stack is full");
        a[++top] = item;
    }

    // isEmpty -> true is stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // pop -> remove top item -> throws EmptyStackException when empty
    public Object pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return null;
        }
        return a[top--];
    }

    // peek -> get top item of the stack
    public Object peek() {
        if (isEmpty()) return null;
        return a[top];
    }

    //size -> returns number of items in the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack astk = new ArrayStack(4);
        astk.push("A");
        astk.push("B");
        astk.pop();
        astk.push("C");
        Stack<Integer> s = new Stack<>();
        s.push(42);
        s.push(-3);
        s.push(17);// bottom [42, -3, 17
        System.out.println(s.pop());// 17
    }
}
