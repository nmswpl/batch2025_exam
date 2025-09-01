package in.co.nmsworks.Exam2;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side size :");
        size = scanner.nextInt();
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0){
                    System.out.print(1);
                }
                else if (j == 0 || j == size-1){
                    System.out.print(i+1);
                } else if (i == size -1) {
                    System.out.print(size);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
