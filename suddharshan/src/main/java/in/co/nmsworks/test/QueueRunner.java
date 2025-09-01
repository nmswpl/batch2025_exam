package in.co.nmsworks.test;

public class QueueRunner {
    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println(queue.peek());

        System.out.println(queue.dequeue());

        queue.display();

        System.out.println(queue.isEmpty());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        queue.display();

        System.out.println(queue.isEmpty());
    }
}
