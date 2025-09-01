package in.co.nmsworks.test2;

import java.util.*;

public class ParkingSpot {


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ParkingSpot that = (ParkingSpot) o;
        return bikecount == that.bikecount && bike == that.bike;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bike, bikecount);
    }

    int spotNumber;
    public enum VehicleType{
        bike(1) ,
        car (2);


        VehicleType(int i) {
        }
    }
    ParkingSpot(String bike,String car){

    }

    VehicleType bike=VehicleType.bike;
    VehicleType car=VehicleType.car;
int bikecount=0;
    public boolean iSbike(){
       List bike =new ArrayList<>();
       bike.add("activea");
       bike.add("plusure+");
       bike.add("honda");
        for(Object b:bike){
            bikecount++;

        }
        if(bikecount>0){
            System.out.println("parking is available ");
        }else{
            System.out.println("not available");
        }

        return iSbike();


    }

    public void parkAVehicle(){
        spotNumber=5;
        if (spotNumber!=0&&bike.equals(VehicleType.bike)){
            System.out.println("Parking successfullyy");
        }
        else {
            System.out.println("Onlyy park a bike");
        }
    }
    public void freeASpot(){
        if(bikecount>0&&bike.equals(VehicleType.bike)){
            System.out.println("park your bike .have a nice day");

        }
        else {
            System.out.println("Not enough space");
        }
    }




}
