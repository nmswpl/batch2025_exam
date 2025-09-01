package in.co.nmsworks;

import java.util.ArrayList;
import java.util.List;

public class StackWithList {
    private List<Integer> stack;

    public StackWithList(){
        stack=new ArrayList<>();

    }

    public void push(int data){
       stack.add(data);
        System.out.println(data);
    }
    public int pop(){
        if (stack.isEmpty()){
            System.out.println("its empty ");
            return -1;
        }
        return stack.remove(0);
    }
    public int peek(){
        if (stack.isEmpty()){
            System.out.println("its empty ");
            return -1;
        }
        return stack.get(1);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
        return stack.size();
    }

    public static void main(String[] args) {
        StackWithList stackWithList=new StackWithList();
        stackWithList.push(1);
        stackWithList.push(2);
        stackWithList.push(3);
        stackWithList.push(4);
        stackWithList.push(5);

        System.out.println("added successfully ");
        stackWithList.pop();
        System.out.println("pop ");
        System.out.println("peek of the list in queue : "+stackWithList.peek());
        System.out.println("size of queue element "+stackWithList.size());
        System.out.println("check is if listqueue empty or not : "+stackWithList.isEmpty());
    }
}
