package in.co.nmsworks.retest;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<String> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public void push(String element) {
        list.add(element);
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return list.remove(list.size()-1);
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return null;
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return list.size();
    }


    public static void main(String[] args) {
        MyStack stack = new MyStack();

       stack.push("a");
       stack.push("b");
       stack.push("c");
       stack.push("d");

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }
    }
}

