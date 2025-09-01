package in.co.nmsworks.Test;

public class LandShipping extends Parcel implements ShippingMethods {
    double basePrice;
    double baseWeight;
    double baseDistance;

    public void setBaseDistance(double baseDistance) {
        this.baseDistance = baseDistance;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    @Override
    public double getBasicPrice() {
        return basePrice;
    }

    @Override
    public double getBaseWeight() {
        return weight;
    }

    @Override
    public double getBaseDistance() {
        return distance;
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
        double addWeight = weight - baseWeight;
        if (addWeight <= 5) {
            return addWeight * 10 + basePrice;
        } else if (addWeight > 5 && addWeight <= 15) {
            return addWeight * 15;
        }
        return addWeight * 20;
    }
}
