package in.co.nmsworks.training_exam_2025;

public interface ShippingMethod
{
    double getBasePrice();
    double getBaseWeight();
    double getBaseDistance();
    double additionalWeightCost(double weight);
    double additionalDistanceCost(double distance);
}
