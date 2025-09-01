package in.co.nmsworks.exam2.parkinglotmanagementsystem;

public class ParkingSpot {
    private int spotNumber;
    private int size;
    Vehicle vehicle = null;

    public ParkingSpot(int spotNumber, int size) {
        this.spotNumber = spotNumber;
        this.size = size;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public boolean isAvailable() {
        if(size == 0){
            return false;
        }
        return true;
    }

    public void park(Vehicle v ) {
        if(isAvailable()) {
            vehicle = v;
            size++;
        }
        else {
            System.out.println("Not Available spots now!!");
        }
    }

    public void freeSpot(Vehicle v) {
        vehicle = null;
    }
}
