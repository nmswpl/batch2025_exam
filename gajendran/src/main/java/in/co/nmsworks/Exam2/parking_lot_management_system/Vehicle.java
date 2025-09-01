package in.co.nmsworks.Exam2.parking_lot_management_system;

import java.util.Map;

public class Vehicle
{
    public enum vehicleType
    {
        BIKE,CAR;
    }
    vehicleType vehicle;
    String licensePlate;

    public Vehicle(String licensePlate, vehicleType vehicleType) {
        this.licensePlate = licensePlate;
        vehicle = vehicleType;
    }

    public vehicleType getVehicle() {
        return vehicle;
    }

    public String getLicensePlate() {
        return licensePlate;
    }
}
