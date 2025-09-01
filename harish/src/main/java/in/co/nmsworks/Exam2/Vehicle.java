package in.co.nmsworks.Exam2;

public class Vehicle {
    String licencePlate;
    Parkingtypes type;

    public Vehicle(String licencePlate,Parkingtypes type) {
        this.type = type;
        this.licencePlate = licencePlate;
    }

    public Parkingtypes getType() {
        return type;
    }

    public void setType(Parkingtypes type) {
        this.type = type;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }
}
