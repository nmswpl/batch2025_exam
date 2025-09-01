package in.co.nmsworks.test;

public class LandShipping implements ShippingMethod {
    private double weight;
    private double distance;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public double getBasePrice() {
        return 30;
    }

    @Override
    public double getBaseWeight() {
        return 50;
    }

    @Override
    public double getBaseDistance() {
        return 100;
    }

    @Override
    public double additionalWeightCost(double weight) {
        double extraWeight = weight - getBaseWeight();
        double cost = 0;
        if (extraWeight <= 25) {
            cost = extraWeight * 30;
        } else if (weight <= 50) {
            cost = (25 * 30) + (extraWeight - 25) * 40;
        } else if (weight > 50) {
            cost = (25 * 30) + (50 * 40) + (extraWeight - 50) * 45;
        }
        return cost;

    }

    @Override
    public double additionalDistanceCost(double distance) {
        double extraDistance = distance - getBaseDistance();
        double cost = 0;
        if (extraDistance <= 300) {
            cost = extraDistance * 20;
        } else if (weight <= 700) {
            cost = (300 * 20) + (extraDistance - 300) * 30;
        } else if (weight > 700) {
            cost = (300 * 20) + (700 * 20) + (extraDistance - 700) * 35;
        }
        return cost;
    }
}
