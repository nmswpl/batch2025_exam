package in.co.nmsworks.test2;

public class Vehicle
{
    public enum VehicleType
    {
        CAR, BIKE
    }
    private VehicleType type;
    private String licencePlate;

    public Vehicle(VehicleType type, String licencePlate)
    {
        this.type = type;
        this.licencePlate = licencePlate;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
