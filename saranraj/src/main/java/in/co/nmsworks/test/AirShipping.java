package in.co.nmsworks.test;

public class AirShipping implements ShippingMethod {
    private double weight;
    private double distance;


    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getBasePrice() {
        return 50;
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
        double cost = 0;
        double extraDistance = distance - getBaseDistance();
        if (extraDistance <= 500) {
            cost = extraDistance * 20;
        } else if (weight <= 1000) {
            cost = (500 * 20) + (extraDistance - 100) * 40;
        } else if (weight > 1000) {
            cost = (500 * 20) + (1000 * 40) + (extraDistance - 1000) * 50;
        }
        return cost;
    }


}
