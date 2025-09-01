package in.co.nmsworks.Exam2.parking_lot_management_system;

import java.util.HashMap;
import java.util.Map;

import static in.co.nmsworks.Exam2.parking_lot_management_system.ParkingSpot.available.*;

public class ParkingSpot
{
    public enum vehicleType
    {
        CAR,BIKE;
    }
    public enum available
    {
        FREE, FULL;
    }
     Map<String,vehicleType> parkingSpot = new HashMap<>();
    Map <String, available> parkingAvailable = new HashMap<>();

    public void addSport(String sport,vehicleType typeOfVehicle)
    {

        parkingAvailable.put(sport, FREE);
        parkingSpot.put(sport,typeOfVehicle);
    }

    public void printAvailable(vehicleType vehicleType)
    {
        for (Map.Entry<String, available> stringavailableEntry : parkingAvailable.entrySet())
        {
            if (stringavailableEntry.getValue().equals(FREE) && parkingSpot.get(stringavailableEntry.getKey()).equals(vehicleType))
            {
                System.out.println(stringavailableEntry.getKey()+ " is Free for ");
            }
        }

    }
    public String parkVehicle(vehicleType vehicleType)
    {
        for (Map.Entry<String, available> stringavailableEntry : parkingAvailable.entrySet())
        {
            if (stringavailableEntry.getValue().equals(FREE) && parkingSpot.get(stringavailableEntry.getKey()).equals(vehicleType))
            {
                parkingAvailable.replace(stringavailableEntry.getKey(), FULL);
                return stringavailableEntry.getKey();
            }
        }

        return "No Slot Available..";
    }

    public boolean freeSpot(String spot, vehicleType vehicleType)
    {
        if (parkingAvailable.get(spot).equals(vehicleType))
        {
            parkingAvailable.replace(spot, FREE);
            return true;
        }
        System.out.println("Invalid Vehicle Type");
        return false;
    }

}
