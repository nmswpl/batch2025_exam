package in.co.nmsworks.exam2;

public class Vehicle {

    private String licensePlate;
    private String vehicleType;

    public Vehicle(){}

    public Vehicle(String licensePlate, String vehicleType){
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
