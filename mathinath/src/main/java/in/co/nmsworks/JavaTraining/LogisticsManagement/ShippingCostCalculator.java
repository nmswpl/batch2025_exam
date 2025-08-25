package in.co.nmsworks.JavaTraining.LogisticsManagement;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        ShippingMethod as = new AirShipping();
        ShippingMethod ls = new LandShipping();
        ShippingMethod ss = new SeaShipping();
        Parcel p = new Parcel(10,10);
        calculateTotalCost(as,p);
        generateQuotation(p);
    }

    private static void generateQuotation(Parcel p) {
        p.getDistance();
    }

    private static void calculateTotalCost(ShippingMethod as, Parcel p) {
        System.out.println("The base disatnce"+ as.getBaseDistance());
        System.out.println("The base price" +  as.getBasePrice());
        System.out.println("The additional disatnce cost:"+ as.additionalDistanceCost(200));
        System.out.println("The additional weigth cost :"+ as.additionalWeightCost(20));
        System.out.println("The base weight: "+as.getBaseWeight());
    }



}
