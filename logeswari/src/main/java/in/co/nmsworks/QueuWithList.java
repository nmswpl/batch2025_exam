package in.co.nmsworks;

import java.util.ArrayList;
import java.util.List;

public class QueuWithList {
    private List<Integer> queue;

    public QueuWithList(){
        queue=new ArrayList<>();
    }

    public void enqueue(int data){
        queue.add(data);
        System.out.println(data);
    }
    public int dequeue(){
        if (queue.isEmpty()){
            System.out.println("its empty ");
            return -1;
        }
        return queue.remove(0);
    }
    public int peek(){
        if (queue.isEmpty()){
            System.out.println("its empty ");
            return -1;
        }
        return queue.get(1);
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public int size(){
        return queue.size();
    }

    public static void main(String[] args) {
        QueuWithList queuWithList=new QueuWithList();
        queuWithList.enqueue(1);
        queuWithList.enqueue(2);
        queuWithList.enqueue(3);
        queuWithList.enqueue(4);
        queuWithList.enqueue(5);
        queuWithList.enqueue(6);
        queuWithList.enqueue(7);
        System.out.println("added successfully ");
        queuWithList.dequeue();
        System.out.println("dequeue ");
        System.out.println("peek of the list in queue : "+queuWithList.peek());
        System.out.println("size of queue element "+queuWithList.size());
        System.out.println("check is if listqueue empty or not : "+queuWithList.isEmpty());
    }


}
