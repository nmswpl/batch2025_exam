package in.co.nmsworks.training_exam_2025.extra_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QueueInList
{
    static List<Integer> stackInList = new ArrayList<>();

    public static void main(String[] args)
    {
        QueueInList stack = new QueueInList();
        stack.runnerLoop();
    }

    private void runnerLoop()
    {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do
        {
            System.out.println();
            System.out.print("1.Push\n2.Pop\n3.Print Peek\n4.Print all in stack\n5.Print a size of Stack\n6.IS Stack is Empty?\n7.Exit\nEnter your choice as a number : ");
            choice = scanner.nextInt();
            QueueInList stack = new QueueInList();
            switch (choice)
            {
                case 1:
                    System.out.println();
                    System.out.print("Enter a value to push : ");
                    Integer temp = scanner.nextInt();
                    stack.push(temp);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Poped Value : "+stack.pop());
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Value in a Peek : "+stack.peek());
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    stack.print();
                    System.out.println();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Size of the Stack : "+stack.size());
                    System.out.println();
                    break;
                case 6:
                    System.out.println();
                    if (isEmpty()) System.out.println("Stack is empty.");
                    else  System.out.println("Stack is not empty");
                    System.out.println();
                    break;
                default:
                    choice = 7;
                    System.out.println("Loop Ended...........");
                    break;
            }
        }while (choice != 7);
    }

    private static boolean isEmpty()
    {
        return stackInList.isEmpty();
    }

    private void print()
    {
        System.out.print("Print Stack values : ");
        for (Integer i : stackInList)
        {
            System.out.print("  "+i+" ");
        }
        System.out.println();
    }

    private int size()
    {
        return stackInList.size();
    }

    private Integer pop()
    {
        if (isEmpty())
        {
            return null;
        }
        return stackInList.removeLast();
    }

    private Integer peek()
    {
        if (isEmpty())
        {
            System.out.println("There is no element in the stack.");
            return null;
        }
        return stackInList.getLast();
    }

    private boolean push(Integer val)
    {
        return stackInList.add(val);
    }
}
