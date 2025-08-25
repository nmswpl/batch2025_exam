package in.co.nmsworks;

public interface LogisticsManagement {
    double getBasePrice();
    double getBaseWeight();
    double getBaseDistance();
    double additionalWeightCost(double weight);
    double additionalDistanceCost(double distance);


}
