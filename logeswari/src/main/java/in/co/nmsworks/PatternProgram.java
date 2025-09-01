package in.co.nmsworks;

import java.util.Scanner;

public class PatternProgram {

    public static void main(String[] args) {
        PatternProgram patternProgram=new PatternProgram();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length of the pattern : ");
        int n=scanner.nextInt();
        patternProgram.printPattern(n);
    }

    private void printPattern(int n) {

        for(int i=0;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
                for(int k=1;k<=i;k++){
                    System.out.println(k);
                }
                for(int k=i-1;k>=1;k--){
                    System.out.println(k);
                }

            }
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n;j>n;j--){
                System.out.print(" ");
                for(int k=1;k<=i;k++){
                    System.out.println(k);
                }
                for(int k=i-1;k>=1;k--){
                    System.out.println(k);

                }

            }
        }


    }
}
