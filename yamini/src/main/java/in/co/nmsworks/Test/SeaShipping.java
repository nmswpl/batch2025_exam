package in.co.nmsworks.Test;

public class SeaShipping implements ShippingMethods{
    @Override
    public double getBasicPrice() {
        return 0;
    }

    @Override
    public double getBaseWeight() {
        return 0;
    }

    @Override
    public double getBaseDistance() {
        return 0;
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
