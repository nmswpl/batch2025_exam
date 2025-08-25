package in.co.nmsworks.Test;

public class LandShipping implements ShippingMethods {
    double basePrice;
    double baseWeight;
    double baseDistace;

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public void setBaseWeight(double baseWeight) {
        this.baseWeight = baseWeight;
    }

    public double getBaseDistace() {
        return baseDistace;
    }

    public LandShipping(double basePrice, double baseWeight, double baseDistace) {
        this.basePrice = basePrice;
        this.baseWeight = baseWeight;
        this.baseDistace = baseDistace;
    }

    public void setBaseDistace(double baseDistace) {
        this.baseDistace = baseDistace;
    }


    @Override
    public double getBasicPrice() {
        return basePrice;
    }

    @Override
    public double getBaseWeight() {
        return baseWeight;
    }

    @Override
    public double getBaseDistance() {
        return baseDistace;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        return 0;
    }

    @Override
    public double additionalWeight(double weight) {
        return 0;
    }
}
