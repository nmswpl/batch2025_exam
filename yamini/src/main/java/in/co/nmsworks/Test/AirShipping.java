package in.co.nmsworks.Test;

public class AirShipping implements ShippingMethods {
    double basePrice = 25;
    double baseWeight = 15;
    double baseDistance = 200;

    public double getBasePrice() {
        return basePrice;
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
        return baseDistance;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        double addDistance = distance - baseDistance;
        if (addDistance <= 300) {
            return addDistance * 20;
        } else if (addDistance >= 300 && addDistance <= 700) {
            return addDistance * 30;
        }
        return addDistance * 35;
    }

    @Override
    public double additionalWeight(double weight) {
        double addWeight = weight - getBaseWeight();
        if (addWeight <= 5) {
            return addWeight * 10 + getBasePrice();
        } else if (addWeight > 5 && addWeight <= 15) {
            return addWeight * 15;
        }
        return addWeight * 20;
    }
}
