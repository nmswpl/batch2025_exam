package in.co.nmsworks.week4.day3;

import java.util.ArrayList;
import java.util.List;

class QueueUsingList {
    private List<Integer> queue;

    public QueueUsingList(){
        queue=new ArrayList<>();
    }

    public void enqueue(int element){
        queue.add(element);
    }

    public int dequeue(){
        int removed=queue.remove(0);
        return removed;
    }

    public int peek(){
        return queue.get(0);
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    public void display(){
        for (Integer i : queue) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
