package in.co.nmsworks.Exam2;

public class ParkingSpotClass {
    int spotNumber;
    public enum size {
        Bike,Car;
    };
    int availabilityStatus;

    public ParkingSpotClass(int spotNumber, int availabilityStatus) {
        this.spotNumber = spotNumber;
        this.availabilityStatus = availabilityStatus;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public void setAvailabilityStatus(int availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public int getAvailabilityStatus() {
        return availabilityStatus;
    }

}
