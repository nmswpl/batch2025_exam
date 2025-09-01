package in.co.nmsworks.revise;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    List<Integer> stackList = new ArrayList<>();

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(2);
        stack.push(9);
        stack.push(8);
        stack.push(5);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        stack.push(7);
        System.out.println(stack.peak());
        System.out.println("Elements in stack: ");
        stack.printStack();
        System.out.println("Popped element: " + stack.pop());
    }

    public void push(int num) {
        stackList.add(0,num);
    }

    public int pop() {
        int element = 0;
        if(isEmpty()) {
            System.out.println("Stack Underflow");
        }
        else {
            element = stackList.remove(0);
        }
        return element;
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }

    public int size() {
        return stackList.size();
    }

    public int peak() {
        return stackList.getFirst();
    }

    public void printStack() {
        for (Integer i : stackList) {
            System.out.println(i + " ");
        }
    }
}
