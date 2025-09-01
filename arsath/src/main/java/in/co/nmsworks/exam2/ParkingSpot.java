package in.co.nmsworks.exam2;

import javax.smartcardio.Card;

public class ParkingSpot {

    private int size;
    private int spotNumber;
    private String availabilityStatus;

    private boolean isAvailable(int spotNumber){
        return false;
    }

    private String parkTheVehicle(int size){
        return "Vehicle is parked";
    }

    private String freeTheSpot(int size){
        return "Spot is freed";
    }
}
