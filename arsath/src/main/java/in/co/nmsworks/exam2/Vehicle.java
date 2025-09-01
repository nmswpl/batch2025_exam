package in.co.nmsworks.exam2;

public class Vehicle {
    private String liscencePlate;
    public enum vehicleType{
        CAR,
        BIKE
    }

    public Vehicle() {
    }

    public String getLiscencePlate() {
        return liscencePlate;
    }

    public void setLiscencePlate(String liscencePlate) {
        this.liscencePlate = liscencePlate;
    }
}
