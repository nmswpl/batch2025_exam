package in.co.nmsworks.test2;

public class ParkingSpot
{
    private int spotNumber;
    private int parkingSpotSize;
    private int availableParkingSize;

    public ParkingSpot(int spotNumber, int parkingSpotSize)
    {
        this.spotNumber = spotNumber;
        this.parkingSpotSize = parkingSpotSize;
        availableParkingSize = parkingSpotSize;
    }

    public int getAvailableParkingSize()
    {
        return availableParkingSize;
    }

    public void setAvailableParkingSize(int availableParkingSize)
    {
        this.availableParkingSize = availableParkingSize;
    }

    public int getSpotNumber()
    {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber)
    {
        this.spotNumber = spotNumber;
    }

    public int getParkingSpotSize()
    {
        return parkingSpotSize;
    }

    public void setParkingSpotSize(int parkingSpotSize)
    {
        this.parkingSpotSize = parkingSpotSize;
        availableParkingSize = parkingSpotSize;
    }

    public boolean checkIfSpotAvailable(Vehicle vehicle)
    {

    }

    public void parkVehicle(Vehicle vehicle)
    {

    }

    public void freeSpot(Vehicle vehicle)
    {

    }
}
