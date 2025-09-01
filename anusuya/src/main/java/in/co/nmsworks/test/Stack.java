package in.co.nmsworks.test;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    List<Integer> stack = new ArrayList<>();
    int top;

    public Stack(){
        top =-1;
    }

    public void push(int data){
        stack.add(data);
        top++;
    }

    public int pop(){
        if(top>-1){
            int val = stack.get(top);
            stack.remove(top);
            top--;
            return val;
        }
        else
            System.out.println("Stack underflow");
        return 0;
    }

    public void peek(){
        System.out.println("PEEK element : " + stack.get(top));
    }

    public void printstack(){
        System.out.println("ELEMENTS OF STACK : ");
        for(int n : stack){
            System.out.print(n + " ");
        }
    }
}
