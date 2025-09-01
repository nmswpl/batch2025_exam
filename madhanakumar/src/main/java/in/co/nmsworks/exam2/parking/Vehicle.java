package in.co.nmsworks.exam2.parking;

public class Vehicle {
    private String licensePlate;
    private Type vehicleType;

    public Vehicle(String licensePlate, Type vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public Type getVehicleType() {
        return vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
