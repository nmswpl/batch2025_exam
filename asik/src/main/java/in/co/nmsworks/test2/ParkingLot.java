package in.co.nmsworks.test2;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot
{
    List<ParkingSpot> carParkingSpots = new ArrayList<>();
    List<ParkingSpot> bikeParkingSpots = new ArrayList<>();

    public void addParkingSpot(Vehicle.VehicleType type, int spotNumber, int parkingSpotSize)
    {
        if (type == Vehicle.VehicleType.BIKE)
        {
            bikeParkingSpots.add(new ParkingSpot(spotNumber, parkingSpotSize));
        }
        else if (type == Vehicle.VehicleType.CAR)
        {
            bikeParkingSpots.add(new ParkingSpot(spotNumber, parkingSpotSize));
        }
    }

    public int findAvailableParkingSpot(Vehicle vehicle)
    {
        if (vehicle.getType() == Vehicle.VehicleType.BIKE)
        {
            for (ParkingSpot ps : bikeParkingSpots)
            {
                if (ps.getAvailableParkingSize() > 0)
                {
                    return ps.getSpotNumber();
                }
            }
        }
        else if (vehicle.getType() == Vehicle.VehicleType.CAR)
        {
            for (ParkingSpot ps : carParkingSpots)
            {
                if (ps.getAvailableParkingSize() > 0)
                {
                    return ps.getSpotNumber();
                }
            }
        }
        System.out.println("No Available Spots For " + vehicle.getType());
        return 0;
    }

    public void parkVehicleInAvailableSpot(Vehicle vehicle)
    {
        int spotNo = findAvailableParkingSpot(vehicle);
        if (vehicle.getType() == Vehicle.VehicleType.BIKE)
        {
            for (ParkingSpot ps : bikeParkingSpots)
            {
                if (spotNo > 0 && ps.getSpotNumber() == spotNo)
                {
                    System.out.println("Successfully Parked The " + vehicle.getType());
                    ps.setAvailableParkingSize(ps.getParkingSpotSize() - 1);
                }
            }
        }
        else if (vehicle.getType() == Vehicle.VehicleType.CAR)
        {
            for (ParkingSpot ps : carParkingSpots)
            {
                if (spotNo > 0 && ps.getSpotNumber() == spotNo)
                {
                    System.out.println("Successfully Parked The " + vehicle.getType());
                    ps.setAvailableParkingSize(ps.getParkingSpotSize() - 1);
                }
            }
        }
    }

    public void freeUpParkingSport(Vehicle vehicle)
    {

    }

    public void printCurrentStatusOfAllParkingSpots(ParkingSpot parkingSpot)
    {

    }
}
