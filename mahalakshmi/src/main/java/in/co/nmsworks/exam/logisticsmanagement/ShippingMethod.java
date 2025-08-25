package in.co.nmsworks.exam.logisticsmanagement;

public interface ShippingMethod {
    double getBasePrice();
    double getBaseWeight();
    double getBaseDistance();
    double additionalWeightCost(double weight);
    double additionalDistanceCost(double distance);
}
