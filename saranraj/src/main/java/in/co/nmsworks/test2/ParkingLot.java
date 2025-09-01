package in.co.nmsworks.test2;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    public static void main(String[] args) {
        ParkingLot pl = new ParkingLot();
        Vehicle car = new Vehicle("CAR456","Car");
        Vehicle bike = new Vehicle("BIKE123","Bike");
        List<ParkingSpot> spot = new ArrayList<>();
        ParkingSpot ps = new ParkingSpot(1, Size.Car, true);
        spot.add(ps);

    }
}
