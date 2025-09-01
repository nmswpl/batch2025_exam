package in.co.nmsworks.test;

import java.util.ArrayList;

public class QueueImplementation {
    private ArrayList<Integer> list = new ArrayList<>();

    void enqueue(int value) {
        list.add(value);
    }

    int dequeue() {
        if (list.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return list.remove(0);
    }

    int peek() {
        if (list.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return list.get(0);
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    void display() {
        if (list.isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            for (int val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
