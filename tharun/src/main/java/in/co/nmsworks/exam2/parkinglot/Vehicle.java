package in.co.nmsworks.exam2.parkinglot;

public class Vehicle {
    private String licensePlate ;
    private VechileType vechileType;

    public Vehicle(String licensePlate, VechileType vechileType) {
        this.licensePlate = licensePlate;
        this.vechileType = vechileType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }
}
