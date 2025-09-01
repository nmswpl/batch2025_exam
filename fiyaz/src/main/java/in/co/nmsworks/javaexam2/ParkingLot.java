package in.co.nmsworks.javaexam2;

public class ParkingLot {

    ParkingSpot parkingSpot = new ParkingSpot();

    void addNewParkingSpots(String vehicle, int n) {


        if (vehicle == "car") {
            parkingSpot.setAvailableForCar(n);
        }
        else {
            parkingSpot.setAvailableForBike(n);
        }

    }

    void findAvailableParking(String vehicle) {

        if (vehicle == "car") {
            int car = parkingSpot.getAvailableForCar();
            System.out.println("The available car parking :: " + car);
        }
        else {
            int bike = parkingSpot.getAvailableForBike();
            System.out.println("The available bike parking :: " + bike);
        }


    }

    void freeingUpParkingSpot() {

    }

    void printingTheCurrentStatus() {

    }

}
