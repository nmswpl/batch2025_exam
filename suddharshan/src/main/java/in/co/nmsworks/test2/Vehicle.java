package in.co.nmsworks.test2;

public class Vehicle {
    private String licensePlate;
    private String vehicleType;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, String vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "licensePlate=" + licensePlate +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}
