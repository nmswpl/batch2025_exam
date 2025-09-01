package in.co.nmsworks.exam2.parking;

enum Type{
    BIKE,
    CAR;
}
public class ParkingSpot {

    private int spotNumber;
    private Type size;
    private boolean isAvailable;
    private Vehicle vehicle;

    public ParkingSpot(int spotNumber, Type size) {
        this.spotNumber = spotNumber;
        this.size = size;
        this.isAvailable = true;
        this.vehicle = null;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public boolean parkVehicle(Vehicle vehicle) {
        if (isAvailable && this.size == vehicle.getVehicleType()) {
            this.vehicle = vehicle;
            this.isAvailable = false;
            return true;
        }
        return false;
    }
    public void freeSpot() {
        this.vehicle = null;
        this.isAvailable = true;
    }
    public int getSpotNumber() {
        return spotNumber;
    }
    public Type getSize() {
        return size;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
}
