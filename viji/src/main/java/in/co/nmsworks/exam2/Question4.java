package in.co.nmsworks.exam2;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length :");
        int n = sc.nextInt();
        lengthOfSquare(n);
    }

    private static void lengthOfSquare(int n) {
        for(int i =1 ; i <= n ; i++){
            for(int  j= 1; j<=n ;j++){
                if(i==1 || j==1|| i==n || j==n){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
