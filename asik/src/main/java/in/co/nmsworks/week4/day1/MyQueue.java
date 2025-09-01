package in.co.nmsworks.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class MyQueue
{
    List<Integer> queue = new ArrayList<>();

    public boolean enque(Integer value)
    {
        return queue.add(value);
    }

    public int deque()
    {
        return queue.removeFirst();
    }

    public int size()
    {
        return queue.size();
    }

    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    public void print()
    {
        System.out.println(queue);
    }
}
