package in.co.nmsworks.retest;

import java.util.ArrayList;

public class MyQueue {
    private ArrayList<String> list;

    public MyQueue() {
        list = new ArrayList<>();
    }

    public void enqueue(String element) {
        list.add(element);
    }


    public String dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return null;
        }
        return list.remove(0);
    }


    public String peek() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return null;
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }


    public int size() {
        return list.size();
    }


    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");

        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println("Dequeue:" + queue.dequeue());
        }
    }
}

