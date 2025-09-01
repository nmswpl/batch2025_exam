package in.co.nmsworks.exam2;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        SquarePattern squarePattern = new SquarePattern();
        squarePattern.printPattern();
    }

    private void printPattern() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int limit = scan.nextInt();
        for (int i = 1 ; i <= limit ; i++){
            for (int j = 1 ; j <= limit ; j++){
                if (i == 1 || i == limit){
                    System.out.print(i+" ");
                } else {
                    if (j == 1 || j == limit){
                        System.out.print(i+" ");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
