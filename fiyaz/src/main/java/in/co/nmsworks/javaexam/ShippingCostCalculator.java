package in.co.nmsworks.javaexam;

import java.util.Scanner;

public class ShippingCostCalculator {

    public static void main(String[] args) {

        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Weight ::" + " ");
        double weigth = sc.nextDouble();
        System.out.println("Distance :: " + " ");
        double distance = sc.nextDouble();

        Parcel parcel = new Parcel(weigth,distance);

        shippingCostCalculator.calculateTotalCost(parcel);

    }





    void calculateTotalCost(Parcel parcel) {


    }

    void generateQuotation(Parcel parcel) {

    }
}
