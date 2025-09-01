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
            if (spot.isAvailable() && spot.getSpotSize() == vehicleType) {
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

    public void freeSpot(int spotNumber) {
        ParkingSpot spot = spots.get(spotNumber);
        if (spot != null) {
            spot.freeSpot();
        }
    }

    public void printStatus() {
        System.out.println("Parking Lot Status:");
        for (ParkingSpot spot : spots.values()) {
            String status = spot.isAvailable() ? "Available" : "Occupied by " + spot.getVehicle().getLicensePlate();
            System.out.println("Spot " + spot.getSpotNumber() + " (" + spot.getSpotSize() + "): " + status);
        }
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingSpot(1, Type.BIKE);
        parkingLot.addParkingSpot(2, Type.CAR);
        parkingLot.addParkingSpot(3,Type.BIKE);
        Vehicle bike1 = new Vehicle("TN 55 AQ 1346", Type.BIKE);
        Vehicle car = new Vehicle("BMW 001 JB 007", Type.CAR);
        Vehicle bike2 = new Vehicle("TN 07 MS 1110",Type.BIKE);
        System.out.println("Parking BIKE => TN 55 AQ 1346 : " + (parkingLot.parkVehicle(bike1) ? "Success" : "Failed"));
        System.out.println("Parking CAR => BMW 001 JB 007 : " + (parkingLot.parkVehicle(car) ? "Success" : "Failed"));
        System.out.println("Parking BIKE => TN 07 MS 1110 : " + (parkingLot.parkVehicle(bike2) ? "Success" : "Failed"));
        parkingLot.printStatus();
        parkingLot.freeSpot(1);
        System.out.println("\nAfter freeing spot 1: ");
        parkingLot.printStatus();
    }
}
