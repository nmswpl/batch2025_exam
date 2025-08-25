package in.co.nmsworks.test;

interface ShippingMethod {
    double getBasePrice();
    double getBaseWeight();
    double getBaseDistance();
    double additionalWeightCost(double weight);
    double additionalDistanceCost(double distance);


}

