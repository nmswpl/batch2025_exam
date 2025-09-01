package in.co.nmsworks.Exam2;

public class ParkingSpot {
    private int spotNumber;
    boolean isAvailable = true;
    Parkingtypes type;

    public ParkingSpot() {
    }

    public ParkingSpot(int spotNumber, Parkingtypes type) {
        this.type = type;
        this.spotNumber = spotNumber;
    }

    public Parkingtypes getType() {
        return type;
    }

    public void setType(Parkingtypes type) {
        this.type = type;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }
    public boolean checkAvailability(){
        return isAvailable;
    }
    public int parkAVehicle(){
        if (isAvailable){
            isAvailable = false;
            return spotNumber;
        }
        else {
            return 0;
        }
    }
    public void leaveVehicle(){
        isAvailable = true;
    }
}
