package in.co.nmsworks.Exam2;

public class Vehicle {
    String licensePlate;
    enum vehicleType
    {
        Bike , Car
    };

    public Vehicle(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
