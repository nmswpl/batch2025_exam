//package in.co.nmsworks.javaexam;
//
//import java.util.Scanner;
//
//public class ShippingCostCalculator {
//
//    public static void main(String[] args) {
//
//        ShippingCostCalculator shippingCostCalculator = new ShippingCostCalculator();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Weight ::" + " ");
//        double weigth = sc.nextDouble();
//        System.out.println("Distance :: " + " ");
//        double distance = sc.nextDouble();
//
//        Parcel parcel = new Parcel(weigth,distance);
//
//        shippingCostCalculator.calculateTotalCost(parcel);
//
//    }
//
//    void calculateTotalCost(Parcel parcel) {
//        AirShipping airShipping = new AirShipping();
//
//        System.out.println("Cost in Air Shipping :: " + (airShipping.additionalWeightCost(parcel.weight) + airShipping.additionalWeightCost(parcel.distance)));
//
//
//        LandShipping landShipping = new LandShipping();
//        System.out.println("Cost of Land Shipping :: " + (landShipping.additionalWeightCost(parcel.weight) + landShipping.additionalDistanceCost(parcel.distance)));
//
//        SeaShipping seaShipping = new SeaShipping();
//        System.out.println("Cost of Sea Shipping :: " + (seaShipping.additionalWeightCost(parcel.weight) + seaShipping.additionalDistanceCost(parcel.distance)));
//
//    }
//
//    void generateQuotation(Parcel parcel) {
//
//    }
//}
////interface ShippingMethod {
////    double getBasePrice();
////    double getBaseWeight();
////    double getBaseDistance();
////    double additionalWeightCost(double weight);
////    double additionalDistanceCost(double distance);
////}
////
////class AirShipping implements ShippingMethod {
////    public double getBasePrice() { return 100; }
////    public double getBaseWeight() { return 5; }
////    public double getBaseDistance() { return 100; }
////
////    public double additionalWeightCost(double weight) {
////        double extra = weight - getBaseWeight();
////        if (extra <= 0) return 0;
////        if (extra <= 10) return extra * 50;
////        if (extra <= 20) return extra * 60;
////        return extra * 70;
////    }
////
////    public double additionalDistanceCost(double distance) {
////        double extra = distance - getBaseDistance();
////        if (extra <= 0) return 0;
////        if (extra <= 500) return extra * 20;
////        if (extra <= 1000) return extra * 40;
////        return extra * 50;
////    }
////}
////
////class LandShipping implements ShippingMethod {
////    public double getBasePrice() { return 80; }
////    public double getBaseWeight() { return 3; }
////    public double getBaseDistance() { return 50; }
////
////    public double additionalWeightCost(double weight) {
////        double extra = weight - getBaseWeight();
////        if (extra <= 0) return 0;
////        if (extra <= 5) return extra * 10;
////        if (extra <= 15) return extra * 15;
////        return extra * 20;
////    }
////
////    public double additionalDistanceCost(double distance) {
////        double extra = distance - getBaseDistance();
////        if (extra <= 0) return 0;
////        if (extra <= 300) return extra * 20;
////        if (extra <= 700) return extra * 30;
////        return extra * 35;
////    }
////}
////
////class SeaShipping implements ShippingMethod {
////    public double getBasePrice() { return 50; }
////    public double getBaseWeight() { return 10; }
////    public double getBaseDistance() { return 30; }
////
////    public double additionalWeightCost(double weight) {
////        double extra = weight - getBaseWeight();
////        if (extra <= 0) return 0;
////        if (extra <= 25) return extra * 30;
////        if (extra <= 50) return extra * 40;
////        return extra * 45;
////    }
////
////    public double additionalDistanceCost(double distance) {
////        double extra = distance - getBaseDistance();
////        if (extra <= 0) return 0;
////        if (extra <= 100) return extra * 10;
////        if (extra <= 500) return extra * 20;
////        return extra * 25;
////    }
////}
////
////class Parcel {
////    double weight;
////    double distance;
////    public Parcel(double weight, double distance) {
////        this.weight = weight;
////        this.distance = distance;
////    }
////}
////
////class ShippingCostCalculator {
////    public double calculateTotalCost(ShippingMethod method, Parcel parcel) {
////        double cost = method.getBasePrice() +
////                method.additionalWeightCost(parcel.weight) +
////                method.additionalDistanceCost(parcel.distance);
////
////        if (method instanceof AirShipping) {
////            cost += cost * 0.025; // fuel surcharge
////        }
////        return cost;
////    }
////
////    public void generateQuotation(Parcel parcel) {
////        ShippingMethod[] methods = { new AirShipping(), new LandShipping(), new SeaShipping() };
////        for (ShippingMethod m : methods) {
////            System.out.println(m.getClass().getSimpleName() + ": " + calculateTotalCost(m, parcel));
////        }
////    }
////
////    public static void main(String[] args) {
////        Parcel parcel = new Parcel(15, 1200);
////        ShippingCostCalculator calc = new ShippingCostCalculator();
////        calc.generateQuotation(parcel);
////    }
////}
