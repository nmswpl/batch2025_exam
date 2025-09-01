package in.co.nmsworks.exam2;

public class ParkingSpot {

    private int spotNumber;
    String availableStatus;

    private enum vehicle{
        Bike,
        Car
    }

    public ParkingSpot(){}

    public ParkingSpot(int spotNumber){
        this.spotNumber = spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setAvailable(String availableStatus) {
        this.availableStatus = availableStatus;
    }

    public String getAvailableStatus() {
        return availableStatus;
    }
}
