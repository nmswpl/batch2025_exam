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

    public ParkingSpot findAvailableSpot(Type vehicleType) {
        for (ParkingSpot spot : spots.values()) {
            if (spot.isAvailable() && spot.getSize() == vehicleType) {
                return spot;
            }
        }
        return null;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getVehicleType());
        if (spot != null) {
            return spot.parkVehicle(vehicle);
        }
        return false;
    }



    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingSpot(1, Type.BIKE);
        parkingLot.addParkingSpot(2, Type.CAR);
        Vehicle bike = new Vehicle("BIKE123", Type.BIKE);
        Vehicle car = new Vehicle("CAR456", Type.CAR);
    }
}
