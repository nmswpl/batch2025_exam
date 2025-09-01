package in.co.nmsworks.exam2;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for(int j=1; j<=n; j++){
                if(i==1){
                    System.out.print(i + " ");
                }
                else if(i==5){
                    System.out.print(i + " ");
                }

                else{
                    if((i==2 && (j==2 || j==3 || j==4)) ||  (i==3 && (j==2 || j==3 || j==4))  || (i==4 && (j==2 || j==3 || j==4))){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print(i + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
