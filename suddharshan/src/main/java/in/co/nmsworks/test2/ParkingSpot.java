package in.co.nmsworks.test2;

public class ParkingSpot {
    private int spotNumber;
    private Vehicle vehicle;
    private boolean availabilityStatus;
    private enum VehicleType{
       BIKE, CAR
    };
    VehicleType vt;

    public ParkingSpot() {
    }

    public ParkingSpot(int spotNumber, Vehicle vehicle, boolean availabilityStatus, VehicleType vt) {
        this.spotNumber = spotNumber;
        this.vehicle = vehicle;
        this.availabilityStatus = availabilityStatus;
        this.vt = vt;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleType getVt() {
        return vt;
    }

    public void setVt(VehicleType vt) {
        this.vt = vt;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
}
