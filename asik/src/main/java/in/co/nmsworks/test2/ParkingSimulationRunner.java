package in.co.nmsworks.test2;

public class ParkingSimulationRunner
{
    public static void main(String[] args)
    {
        ParkingLot pl = new ParkingLot();

        Vehicle car = new Vehicle(Vehicle.VehicleType.CAR, "CAR456");
        Vehicle bike = new Vehicle(Vehicle.VehicleType.BIKE, "BIKE123");

        pl.addParkingSpot(Vehicle.VehicleType.CAR, 1, 50);
        pl.addParkingSpot(Vehicle.VehicleType.BIKE, 2, 30);
    }
}
