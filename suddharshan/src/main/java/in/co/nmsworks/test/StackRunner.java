package in.co.nmsworks.test;

public class StackRunner {
    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println(stack.peek());

        System.out.println(stack.pop());

        stack.display();

        System.out.println(stack.isEmpty());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        stack.display();

        System.out.println(stack.isEmpty());
    }
}
