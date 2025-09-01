package in.co.nmsworks.test2;

import java.util.HashMap;
import java.util.Scanner;

public class ParkingLot {
    Scanner sc = new Scanner(System.in);
    HashMap <Integer, ParkingSpot> parkingLotList = new HashMap<>();
    public static void main(String[] args) {

        ParkingLot parkingLot = new ParkingLot();
    }
    public void addSpot(){
        int spot = 1;
        System.out.print("Enter Vehicle Plate Number: ");
        String pn = sc.next();
        System.out.print("Enter Vehicle Type: ");
        String type = sc.next();
        Vehicle vehicle = new Vehicle(pn,type);

    }
}
