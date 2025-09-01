package in.co.nmsworks.exam2;

import java.util.Scanner;

public class ParkingLot {

    public static void main(String[] args) {

        ParkingLot pl = new ParkingLot();
        pl.parkingOperations();
    }

    private void parkingOperations() {

        Scanner sc = new Scanner(System.in);
        System.out.println("ADMIN....PRESS 1");
        System.out.println("USER.....PRESS 0\n");
        System.out.print("ENTER : ");
        int userType = sc.nextInt();

        if (userType == 1){
            System.out.print("Do you want to add a parking spot? PRESS 1 :  ");
            int temp = sc.nextInt();
            if (temp == 1){
                addVehicleSpot();
            }
        }
    }

    private void addVehicleSpot() {

    }
}
