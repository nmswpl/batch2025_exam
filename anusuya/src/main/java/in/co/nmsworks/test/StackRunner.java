package in.co.nmsworks.test;

public class StackRunner {

    public static void main(String[] args) {

        StackRunner sr = new StackRunner();
        sr.stackOperations();
    }

    private void stackOperations() {

        Stack nums = new Stack();

        nums.push(10);
        nums.push(30);

        System.out.println(nums.pop());

        nums.push(70);
        nums.push(20);
        nums.push(90);
        nums.push(50);

        nums.peek();

        nums.printstack();
    }
}
