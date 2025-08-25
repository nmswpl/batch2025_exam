package in.co.nmsworks.exam;

public class AirShipping implements ShippingMethod{

    double basePrice = 2000d;
    @Override
    public double getBasePrice() {
        return basePrice;
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
    public double additionalWeightCost(double weight) {
        return 0;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        return 0;
    }
}
