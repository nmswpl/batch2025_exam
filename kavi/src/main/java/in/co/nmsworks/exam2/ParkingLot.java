package in.co.nmsworks.exam2;

import java.util.HashMap;

public class ParkingLot {
    private HashMap<Integer, ParkingSpot> spots = new HashMap<>();


    public void addParkingSpot(int spotNumber, VehicleType size) {
        spots.put(spotNumber, new ParkingSpot(spotNumber, size));
    }

    public ParkingSpot findAvailableSpot(VehicleType type) {
        for (ParkingSpot spot : spots.values()) {
            if (spot.isAvailable() && spot.getSize() == type) {
                return spot;
            }
        }
        return null;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        ParkingSpot spot = findAvailableSpot(vehicle.getType());
        if (spot != null) {
            return spot.parkVehicle(vehicle);
        }
        return false;
    }

    public boolean freeSpot(int spotNumber) {
        ParkingSpot spot = spots.get(spotNumber);
        if (spot != null && spot.isAvailable()) {
            spot.freeSpot();
            return true;
        }
        return false;
    }

    public void printStatus() {
        System.out.println("parking lot status:");
        for (ParkingSpot spot : spots.values()) {
            String status = spot.isAvailable() ? "Available " :" occupied by " + spot.getParkedVehicle().getLicensePlate();
            System.out.println("spot " + spot.getSpotNumber() + spot.getSize()+ status);
        }
    }

    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();


        lot.addParkingSpot(1, VehicleType.Bike);
        lot.addParkingSpot(2, VehicleType.Car);


        Vehicle bike = new Vehicle("BIKE123", VehicleType.Bike);
        Vehicle car = new Vehicle("CAR456", VehicleType.Car);


        if (lot.parkVehicle(bike)) {
            System.out.println("Bike parked successfully");
        }
        else {
            System.out.println("Bike parking failed");
        }

        if (lot.parkVehicle(car)) {
            System.out.println("Car parked successfully");
        }
        else {
            System.out.println("Car parking failed");
        }


        lot.printStatus();


        lot.freeSpot(1);
        System.out.println("After freeing spot 1:");
        lot.printStatus();
    }
}


