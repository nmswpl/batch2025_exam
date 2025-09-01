package in.co.nmsworks.javaexam2;

import java.util.Scanner;

public class PrintInConsole {
    public static void main(String[] args) {

        PrintInConsole printInConsole = new PrintInConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :::");
        int num = scanner.nextInt();

        printInConsole.printInSquare(num);

    }

    private void printInSquare(int num) {

        System.out.println("1 1 1 1");
        for (int i=1; i<=num-2; i++) {
            for (int j=2;j<=num-1; j++) {
                System.out.println(j + "     " + j);
            }
            break;
        }
        System.out.println(num + " " + num + " " + num + " " + num);
    }
}
