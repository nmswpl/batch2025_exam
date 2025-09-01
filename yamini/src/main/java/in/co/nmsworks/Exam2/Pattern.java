package in.co.nmsworks.Exam2;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int length = scan.nextInt();
        Pattern p= new Pattern();
        p.generatePattern(length);

    }

    public void generatePattern(int n){
        if(n<3){
            System.out.println("Invalid input");
            return;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print(i);
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
