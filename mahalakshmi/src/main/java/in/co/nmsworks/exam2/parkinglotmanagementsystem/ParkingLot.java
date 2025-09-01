package in.co.nmsworks.exam2.parkinglotmanagementsystem;

public class ParkingLot {
    public static void main(String[] args) {
        ParkingLot pl = new ParkingLot();
        ParkingSpot carSpot = pl.addParkingSpot(1,4);
        ParkingSpot bikeSpot = pl.addParkingSpot(2,3);
    }

    public ParkingSpot addParkingSpot(int num, int size) {
        return new ParkingSpot(num,size);
    }

//    public int checkAvailableParkingSpot(Vehicle vehicle) {
//        if(vehicle.VechileType == Vehicle.VechileType.Bike) {
//            return ParkingSpot;
//        }
//        else {
//
//        }
//    }

}
