package in.co.nmsworks.test;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    private int front;
    private int rear;
    private List<Integer> queue = new ArrayList<>();

    public Queue(){
        front = 0;
        rear=-1;
    }

    public void enqueue(int data){
        queue.add(data);
        rear++;
    }

    public int dequeue(){

        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }

        int data = queue.get(front);
        queue.remove(front);
        rear--;
        return data;

    }

    public int peek(){

        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            return queue.get(front);
        }
        return 0;
    }

    public boolean isEmpty(){
        return queue.size() == 0;
    }
}
