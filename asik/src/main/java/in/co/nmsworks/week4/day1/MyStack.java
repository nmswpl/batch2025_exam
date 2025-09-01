package in.co.nmsworks.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class MyStack
{
    List<Integer> stack = new ArrayList<>();

    public boolean push(Integer value)
    {
        return stack.add(value);
    }

    public int pop()
    {
        return stack.removeLast();
    }

    public int size()
    {
        return stack.size();
    }

    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public void print()
    {
        System.out.println(stack);
    }
}
