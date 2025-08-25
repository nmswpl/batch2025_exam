package in.co.nmsworks.test;

public interface ShippingMethod {
     public double getPrice();
     public double getBaseWeight();
    public double getBaseDistance();
    double additionalWeightCost(double weight);
    double additionalDistanceCost(double distance);

}
