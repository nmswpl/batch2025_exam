package in.co.nmsworks.JavaTraining.LogisticsManagement;

public interface ShippingMethod {
    double getBasePrice();
    double getBaseWeight();
    double getBaseDistance();
    double additionalWeightCost(double weight);
    double additionalDistanceCost(double distance);
}
