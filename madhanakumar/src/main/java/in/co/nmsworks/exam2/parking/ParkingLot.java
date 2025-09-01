package in.co.nmsworks.exam2.parking;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private Map<Integer, ParkingSpot> spots;

    public ParkingLot() {
        this.spots = new HashMap<>();
    }

    public void addParkingSpot(int spotNumber, Type size) {
        spots.put(spotNumber, new ParkingSpot(spotNumber, size));
    }



    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingSpot(1, Type.BIKE);
        parkingLot.addParkingSpot(2, Type.CAR);
        Vehicle bike = new Vehicle("BIKE123", Type.BIKE);
        Vehicle car = new Vehicle("CAR456", Type.CAR);
    }
}
