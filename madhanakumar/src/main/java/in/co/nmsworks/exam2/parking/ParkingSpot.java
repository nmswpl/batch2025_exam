package in.co.nmsworks.exam2.parking;

enum Type{
    BIKE,
    CAR;
}
public class ParkingSpot {

    private int spotNumber;
    private Type spotSize;
    private boolean isAvailable;
    private Vehicle vehicle;

    public ParkingSpot(int spotNumber, Type spotSize) {
        this.spotNumber = spotNumber;
        this.spotSize = spotSize;
        this.isAvailable = true;
        this.vehicle = null;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public boolean parkVehicle(Vehicle vehicle) {
        if (isAvailable && this.spotSize == vehicle.getVehicleType()) {
            this.vehicle = vehicle;
            this.isAvailable = false;
            return true;
        }
        return false;
    }
    public int getSpotNumber() {
        return spotNumber;
    }
    public Type getSpotSize() {
        return spotSize;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
}
