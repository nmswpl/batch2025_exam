package in.co.nmsworks.exam2.parkinglot;

public class CallingClass {
    public void commonMethod() {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.addParkingSpot(1,VechileType.BIKE);
        System.out.println(parkingLot.parkkingLotMap);

        Vehicle bike = new Vehicle("BIKE123" , VechileType.BIKE);

        Vehicle car = new Vehicle("CAR456",VechileType.CAR);

    }
}
