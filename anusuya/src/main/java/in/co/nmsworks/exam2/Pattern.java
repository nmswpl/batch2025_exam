package in.co.nmsworks.exam2;

import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Pattern p = new Pattern();

        p.printPattern();
    }

    private void printPattern() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int limit = sc.nextInt();

        for (int i = 1; i <= limit; i++){

            for (int j = 1; j <= limit; j++){
                if ((i == 1) || (i == limit)){
                    System.out.print(i);
                }
                if(i > 1 && i < limit){
                    if((j == 1) || (j == limit)){
                        System.out.print((i));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
