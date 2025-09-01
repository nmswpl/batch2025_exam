package in.co.nmsworks.JavaTraining.LogisticsManagement;

import java.util.*;

public class StackAndQueue {
    public static void main(String[] args) {
      Stack s1 = new Stack();
      s1.push(2);
      s1.push(3);
      s1.push(1);
        System.out.println(s1);
        s1.pop();
        System.out.println(s1);
        s1.peek();
        System.out.println(s1.peek());
        System.out.println("The size is :"+s1.size());
        System.out.println("is that empty :"+s1.isEmpty());
        System.out.println("The elements are :"+s1);
    }


}
