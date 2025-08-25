package in.co.nmsworks.JavaTraining;

import java.util.Scanner;

public class LoginCredential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        String name = sc.nextLine();
        System.out.println("Enter password :");
        String password = sc.next();
    }
}
