package in.co.nmsworks.week4.day3;

import java.util.ArrayList;
import java.util.List;

class StackUsingList {
    private List<Integer> stack;

    public StackUsingList(){
        stack=new ArrayList<>();
    }

    public void push(int element){
        stack.add(element);
    }

    public int pop(){
        int removed;
        removed = stack.remove(stack.size()-1);
        return removed;
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int top(){
        return stack.get(stack.size()-1);
    }

    public void display(){
        for(int i=stack.size()-1;i>=0;i--){
            System.out.println(stack.get(i));
        }
    }

}
