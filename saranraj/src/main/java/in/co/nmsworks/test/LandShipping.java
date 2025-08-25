package in.co.nmsworks.test;

public class LandShipping implements ShippingMethod {
    private double weight;
    private double cost;
    private double distance;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public double getBasePrice() {
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
    public double additionalWeightCost(double weight) {
        if (weight <= 5) {
            cost += 10;
        } else if (weight > 5 && weight >= 15) {
            cost += 15;
        } else if (weight > 15) {
            cost += 20;
        }
        return cost * weight;

    }

    @Override
    public double additionalDistanceCost(double distance) {
        double calculateKm = 0;
        if (distance <= 300) {
            calculateKm += 20;
        } else if (distance > 300 && distance >= 700) {
            calculateKm += 30;
        } else if (distance > 700) {
            calculateKm += 35;
        }
        return calculateKm * distance;
    }
}
