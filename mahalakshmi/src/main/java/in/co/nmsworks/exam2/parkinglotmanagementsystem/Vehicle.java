package in.co.nmsworks.exam2.parkinglotmanagementsystem;

public class Vehicle {
    private String licensePlate;
    public enum VechileType{
        Bike,
        Car
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

}
