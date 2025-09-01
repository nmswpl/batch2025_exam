package in.co.nmsworks.week4.day3;

public class Launch {
    public static void main(String[] args) {
        StackUsingList su=new StackUsingList();
        su.push(1);
        su.push(2);
        su.push(3);
        su.push(4);
        su.push(5);
        su.display();
        int top=su.top();
        System.out.println("Top of the stack is: "+top);
        int size=su.size();
        System.out.println("Size of the stack: "+size);
        System.out.println("Popped element: "+su.pop());
        su.display();
        System.out.println(su.isEmpty());

        QueueUsingList queue=new QueueUsingList();
        queue.enqueue(1);;
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
//        queue.dequeue();
//        System.out.println();
//        queue.display();
//        System.out.println();
        System.out.println(queue.size());
    }
}
