package in.co.nmsworks.Exam2.parking_lot_management_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot
{
    static int countVehicles = 0;
    static List<ParkingSpot> parkingSpots = new ArrayList<>();
    static List<Vehicle> vehicles = new ArrayList<>();
    static Map<String,String> vehicleParkedOn = new HashMap<>();


    private void addParkingSpot()
    {
        ParkingSpot parkingSpot = new ParkingSpot();

        for (int i = countVehicles; i <= 5 + countVehicles; i++)
        {
            System.out.println(i);
            parkingSpot.addSport(""+i, ParkingSpot.vehicleType.CAR);
        }
        countVehicles += 5;
        for (int i = countVehicles; i < 5 + countVehicles; i++)
        {
            parkingSpot.addSport(""+i, ParkingSpot.vehicleType.BIKE);
        }
        countVehicles += 5;
        parkingSpots.add(parkingSpot);

    }

    private void availableParking(Vehicle i)
    {
        System.out.println("Available for ");
        for (ParkingSpot parkingSpot : parkingSpots)
        {
            parkingSpot.printAvailable(ParkingSpot.vehicleType.CAR);
        }

        System.out.println("Available for BIKE");
        for (ParkingSpot parkingSpot : parkingSpots)
        {
            parkingSpot.printAvailable(ParkingSpot.vehicleType.BIKE);
        }
    }

    public static void main(String[] args)
    {
        System.out.println("aaaaaa");
        ParkingLot parkingLot = new ParkingLot();

        System.out.println("bbbbb");
        parkingLot.addParkingSpot();
        System.out.println("ccccc");
        parkingLot.addParkingSpot();
        System.out.println("dddddd");
        parkingLot.availableParking(vehicles.get(0));
        System.out.println("eeeeeee");
        parkingLot.parkingAVehicle(vehicles.get(2));
        System.out.println("ffffff");
        parkingLot.freeUpParkingSpot(vehicles.get(2),vehicleParkedOn.get(vehicles.get(2)));
        parkingLot.freeUpParkingSpot(vehicles.get(3),vehicleParkedOn.get(vehicles.get(3)));


        parkingLot.printCurrentStatusParkingSpots();
    }

    private void printCurrentStatusParkingSpots()
    {

        System.out.println("Available For Car.....");
        for (ParkingSpot parkingSpot : parkingSpots)
        {
            parkingSpot.printAvailable(ParkingSpot.vehicleType.CAR);
        }
        System.out.println("Available For Bike.....");
        for (ParkingSpot parkingSpot : parkingSpots)
        {
            parkingSpot.printAvailable(ParkingSpot.vehicleType.BIKE);
        }
    }

    private void freeUpParkingSpot(Vehicle vehicle, String spot)
    {
        if (vehicleParkedOn.get(vehicle).equals(spot))
        {
            boolean flag = false;
            for (ParkingSpot parkingSpot : parkingSpots)
            {
                if (parkingSpot.freeSpot(spot, ParkingSpot.vehicleType.valueOf(vehicle.getVehicle())))
                {
                    flag = true;
                    System.out.println("Slot free up..");
                }
            }
            if (flag == false)
            {
                System.out.println("Some thing went worng...");
            }
        }

    }

    private void parkingAVehicle(Vehicle i)
    {
        for (ParkingSpot parkingSpot : parkingSpots)
        {
            String temp = parkingSpot.parkVehicle(ParkingSpot.vehicleType.valueOf(i.getVehicle()));
            System.out.println(i.getVehicle() + " Parked in "+ temp);
            vehicleParkedOn.put(i.getVehicle(),temp);
        }
    }
}
