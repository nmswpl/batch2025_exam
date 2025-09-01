package in.co.nmsworks.test;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private int maxSize;
    private List<Integer> queueList;

    public Queue(int size) {
        this.maxSize = size;
        this.queueList = new ArrayList<>();
    }

    public void enqueue(int value) {
        if (queueList.size() < maxSize) {
            queueList.add(value);
        } else {
            System.out.println("Queue is Full");
        }
    }

    public void dequeue() {
        if (!queueList.isEmpty()) {
            queueList.remove(0);
        } else {
            System.out.println("Queue is Empty");
        }
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }

    public int size() {
        return queueList.size();
    }


    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(5);
        queue.enqueue(4);
        queue.size();

    }
}
