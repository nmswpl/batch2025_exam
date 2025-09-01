package in.co.nmsworks.exam2.parkinglot;

public class ParkingSpot {

    private int spotNumber;
    private VechileType vechileType;
    private boolean avaliablity = true;

    public ParkingSpot() {
    }

    public ParkingSpot(int spotNumber, VechileType vechileType) {
        this.spotNumber = spotNumber;
        this.vechileType = vechileType;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }

    public boolean isavailable(){
        return this.avaliablity;
    }
    public boolean parkVechile(){
        return this.avaliablity = false;
    }
    public boolean freeSpot(){
        return this.avaliablity = true;
    }

}
