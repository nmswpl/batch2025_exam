package in.co.nmsworks.javaexam2;

public class ParkingLotManagementSystem {
    public static void main(String[] args) {

        ParkingLotManagementSystem parkingLotManagementSystem = new ParkingLotManagementSystem();

        Vehicle car = new Vehicle("Car","CAR456");
        Vehicle bike = new Vehicle("Bike", "BIKE123");


        ParkingLot parkingLot = new ParkingLot();

        parkingLot.addNewParkingSpots("car", 6);
        parkingLot.addNewParkingSpots("bike",10);


       parkingLot.findAvailableParking("car");
       parkingLot.findAvailableParking("bike");




    }
}
