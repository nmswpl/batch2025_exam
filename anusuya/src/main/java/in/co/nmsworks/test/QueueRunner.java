package in.co.nmsworks.test;

public class QueueRunner {

    public static void main(String[] args) {

        QueueRunner qr = new QueueRunner();
        qr.queueOperations();
    }

    private void queueOperations() {

        Queue nums = new Queue();

        nums.enqueue(10);
        nums.enqueue(20);
        nums.enqueue(5);
        nums.enqueue(99);

        System.err.println(nums.dequeue());
        System.out.println("peek" + nums.peek());

        nums.enqueue(12);
        nums.enqueue(32);

        System.out.println("peek" + nums.peek());

        System.err.println(nums.dequeue());
        System.out.println("peek" + nums.peek());
        System.err.println(nums.dequeue());
        System.out.println("peek" + nums.peek());
        System.err.println(nums.dequeue());
        System.out.println("peek" + nums.peek());
        System.err.println(nums.dequeue());
        System.out.println("peek" + nums.peek());
        System.err.println(nums.dequeue());

        System.out.println(nums.peek());
    }
}
