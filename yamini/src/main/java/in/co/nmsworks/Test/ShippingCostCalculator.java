package in.co.nmsworks.Test;

public class ShippingCostCalculator {

    public static void main(String[] args) {
        AirShipping as=new AirShipping();
        Parcel p1=new Parcel();
        p1.setDistance(200);
        p1.setWeight(45);
        ShippingCostCalculator scc=new ShippingCostCalculator();
        scc.calculateTotalCost(as,p1);

    }

    public void calculateTotalCost(ShippingMethods shippingMethod, Parcel parcel){
        double weightCost=0;
        double distanceCost=0;
        if(shippingMethod instanceof AirShipping){
            if(parcel.getWeight() <= shippingMethod.getBaseWeight()){
                weightCost =  shippingMethod.getBasicPrice();
            }
            else{
               weightCost = shippingMethod.additionalWeight(45)+(((AirShipping) shippingMethod).getBasePrice());
            }
            if(parcel.getDistance() <= shippingMethod.getBaseDistance()){
                distanceCost = shippingMethod.getBasicPrice();
            }
            else {
                ((AirShipping) shippingMethod).getBasePrice();
            }
            System.out.println("Weightcost and Distance cost for AirShipping: "+weightCost +", "+distanceCost);

        }
    }

}
