package in.co.nmsworks.Exam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ParkingLot {
    public static void main(String[] args) {
//        Map<Integer,Parkingtypes> spots = new HashMap<>();
//        spots.put(123,Parkingtypes.Bike);
//        spots.put(124,Parkingtypes.Car);
//        spots.put(125,Parkingtypes.Bike);
//        spots.put(126,Parkingtypes.Car);
//        spots.put(127,Parkingtypes.Bike);
//        spots.put(128,Parkingtypes.Car);
//        spots.put(129,Parkingtypes.Bike);
//        spots.put(130,Parkingtypes.Car);
//        parkingLot.AvailableParkingSpot(spots,Parkingtypes.Bike);

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(addParkingSpot(124,Parkingtypes.Bike));
        parkingSpots.add(addParkingSpot(125,Parkingtypes.Car));
        parkingSpots.add(addParkingSpot(127,Parkingtypes.Car));
        parkingSpots.add(addParkingSpot(126,Parkingtypes.Bike));
        AvailableParkingSpot(parkingSpots,Parkingtypes.Bike);
        Vehicle vehicle = new Vehicle("BIKE123",Parkingtypes.Bike);
        Vehicle vehicle2 = new Vehicle("BIKE124",Parkingtypes.Bike);
        Vehicle vehicle3 = new Vehicle("BIKE125",Parkingtypes.Bike);
        parkAVehicle(vehicle,parkingSpots);
        parkAVehicle(vehicle2,parkingSpots);
        parkAVehicle(vehicle3,parkingSpots);
        freeUpParkingSpot(125,parkingSpots);
        prinTheCurrentStatus(parkingSpots);

    }

    private static void prinTheCurrentStatus(List<ParkingSpot> parkingSpots) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.isAvailable) {
                System.out.println(parkingSpot.getSpotNumber() + ":" + parkingSpot.getType() + " Vehicle parked");
            }
            else {
                System.out.println(parkingSpot.getSpotNumber() + ":" + parkingSpot.getType() + " Vehicle Not  parked");
            }
        }
    }

    private static void freeUpParkingSpot(int spotNumber, List<ParkingSpot> parkingSpots) {
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (parkingSpot.getSpotNumber() == spotNumber){
                parkingSpot.leaveVehicle();
            }
        }
    }

    private static void parkAVehicle(Vehicle vehicle,List<ParkingSpot> parkingSpots) {
        boolean vehicleStatus = false;
        int spotNumber = 0;
        for (ParkingSpot parkingSpot : parkingSpots) {
            if (vehicle.getType() == parkingSpot.getType()){
                if (parkingSpot.isAvailable){
                    parkingSpot.parkAVehicle();
                    vehicleStatus = true;
                    spotNumber = parkingSpot.getSpotNumber();
                    break;
                }
            }
        }
        if (vehicleStatus){
            System.out.println("Vehicle Parked Succesfully;" + spotNumber);
        }
        else {
            System.out.println("There is no parking space available");
        }
    }

    public static void AvailableParkingSpot(List<ParkingSpot> parkingSpots, Parkingtypes parkingtypes) {
        for (ParkingSpot parkingSpot : parkingSpots) {
           if (parkingSpot.getType() == parkingtypes){
               System.out.println("The Parking type :"+ parkingtypes + " spot Number :" +parkingSpot.getSpotNumber());
           }
        }
    }
    public  static ParkingSpot addParkingSpot(int number,Parkingtypes parkingtypes){
        ParkingSpot ps = new ParkingSpot(number,parkingtypes);
        return ps;
    }

}
