package in.co.nmsworks.test;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private int maxSize;
    private int size;

    private List<Integer> stackValue;

    public Stack(int size) {

        this.stackValue = new ArrayList<>();
        this.maxSize = size;
    }

    public void push(int value) {
        if (stackValue.size() < maxSize) {
            stackValue.add(value);
        } else {
            System.out.println("Stack is full");
        }

    }

    public void pop() {
        if (!stackValue.isEmpty()) {
            stackValue.remove(stackValue.size() - 1);
        }
    }

    public boolean isEmpty() {
        return stackValue.isEmpty();
    }

    public int peek() {
        return stackValue.get(stackValue.size() - 1);
    }

    public int size() {
        return stackValue.size();
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.pop();
        System.out.println(s.size());
    }
}
