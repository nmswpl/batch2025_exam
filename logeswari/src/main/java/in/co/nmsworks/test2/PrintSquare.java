package in.co.nmsworks.test2;

import java.util.Scanner;

public class PrintSquare {

    public void printSquarePattern(){

        Scanner  details=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num=details.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==2&i==3&&i==4){
                    System.out.print(" ");

                }

                System.out.print(i);

            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        PrintSquare printSquare=new PrintSquare();
        printSquare.printSquarePattern();
    }
}
