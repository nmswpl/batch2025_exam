package in.co.nmsworks.Test;

public interface ShippingMethods {
    double getBasicPrice();
    double getBaseWeight();
    double getBaseDistance();
    double additionalDistanceCost(double distance);
    double additionalWeight(double weight);
}
