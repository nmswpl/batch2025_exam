package in.co.nmsworks.test;

import java.util.ArrayList;

public class StackImplementation {
    private ArrayList<Integer> list = new ArrayList<>();

    void push(int value) {
        list.add(value);
    }

    int pop() {
        if (list.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return list.remove(list.size() - 1);
    }

    int peek() {
        if (list.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return list.get(list.size() - 1);
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    void display() {
        if(list.isEmpty()){
            System.out.println("Stack is empty" );
        }
        else{
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }

    }
}


