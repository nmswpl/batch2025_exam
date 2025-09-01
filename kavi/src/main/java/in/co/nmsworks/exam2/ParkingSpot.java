package in.co.nmsworks.exam2;


public class ParkingSpot {
    private int spotNumber;
    private VehicleType size;
    private boolean isAvailable;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber, VehicleType size) {
        this.spotNumber = spotNumber;
        this.size = size;
        this.isAvailable = true;
        this.parkedVehicle = null;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return this.size == vehicle.getType();
    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (isAvailable && canFitVehicle(vehicle)) {
            parkedVehicle = vehicle;
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void freeSpot() {
        parkedVehicle = null;
        isAvailable = true;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleType getSize() {
        return size;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    @Override
    public String toString() {
        return "Spot " + spotNumber + " (" + size + ") - " + (isAvailable ? "Available" : "Occupied by " + parkedVehicle.getLicensePlate());
    }
    
}

