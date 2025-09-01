package in.co.nmsworks.exam2.parkinglot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {

    Map<Integer,VechileType> parkkingLotMap = new HashMap<>();

    public void addParkingSpot(int spotNumber , VechileType type){
        ParkingSpot parkingSpot = new ParkingSpot(spotNumber,type);
        parkkingLotMap.put(parkingSpot.getSpotNumber(),parkingSpot.getVechileType());
    }
    public void availableParkingSpot(){

    }
    public void parkVechile(){
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.parkVechile();
    }
    public void freeUpSlots(){
        ParkingSpot parkingSpot = new ParkingSpot();
        parkingSpot.freeSpot();
    }



}
