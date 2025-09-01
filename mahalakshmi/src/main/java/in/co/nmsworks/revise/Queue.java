package in.co.nmsworks.revise;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    List<Integer> queueList = new ArrayList<>();


    public static void main(String[] args) {
        Queue q = new Queue();
        q.enque(2);
        q.enque(9);
        q.enque(8);
        q.enque(5);
        q.printQueue();
        System.out.println(q.peak());
        System.out.println("Removed element: " + q.deque());
        System.out.println("Removed element: " + q.deque());
        System.out.println();
    }

    public void enque(int num) {
        queueList.add(num);
    }

    public int deque() {
        int element = 0;
        if(isEmpty()) {
            System.out.println("Queue is empty!");
        }
        else {
            element = queueList.removeFirst();
        }
    }

    public void printQueue() {
        for (Integer i : queueList) {
            System.out.println(i);
        }
    }

    public int peak() {
        return queueList.getFirst();
    }

    public int size() {
        return queueList.size();
    }

    public boolean isEmpty() {
        return queueList.isEmpty();
    }
}
