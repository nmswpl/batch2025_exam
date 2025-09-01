package in.co.nmsworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StackAndQueueUsingList
{
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("Enter the number to push : ");
            int num = sc.nextInt();
            push(lst,num);
        }
    }
    public static void push(List<Integer> lst,int num ){
        lst.add(num);
    }
    public static void pop(List<Integer> lst){
        lst.removeLast();
    }
    public static void top(List<Integer> lst){
        lst.getLast();
    }
    public static  boolean isEmpty(List<Integer> lst){
        if(lst.isEmpty()){
            return true;
        }
        return false;
    }

}
