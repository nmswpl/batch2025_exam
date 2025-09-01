package in.co.nmsworks.test2;

enum Size {
    Bike,Car;
}

public class ParkingSpot {
    private int spotNumber;
    private Size size;
    private boolean isAvailable;

    public boolean isAvailable() {
        return isAvailable;
    }

    public ParkingSpot(int spotNumber, Size size, boolean isAvailable) {
        this.spotNumber = spotNumber;
        this.size = size;
        this.isAvailable = isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


}
