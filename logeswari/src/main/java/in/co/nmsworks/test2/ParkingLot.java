package in.co.nmsworks.test2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ParkingLot {
    Map<String,String> bike=new HashMap<>();
    Map<String,String> car=new HashMap<>();
    int carCount=0;
    int bikeCount=0;
    public void addingNew(){
        if(this.equals("bike")){

            bike.put("b1","active");
            bike.put("b2","plusher+");
            bike.put("b3","honda");
           bikeCount++;

            System.out.println("bike details can added successfullyy");
        }
        else {

            car.put("c1","active");
            car.put("c2","plusher+");
            car.put("c3","honda");
            carCount++;
            System.out.println("car details can added successfullyy");

        }
    }

    public boolean isAvailable(){

        if(this.equals("bike")&&bikeCount>0){
            System.out.println("Welcome bike parking available");

              } else if (this.equals("car")&&bikeCount>0) {

            System.out.println("Welcome car parking available");

        }else
        {
            System.out.println("invalid ");
        }
        return isAvailable();
    }

}
