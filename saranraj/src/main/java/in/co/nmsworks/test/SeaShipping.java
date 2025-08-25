package in.co.nmsworks.test;

public class SeaShipping implements ShippingMethod {
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
        if (weight <= 25) {
            cost += 30;
        } else if (weight > 25 && weight >= 50) {
            cost += 40;
        } else if (weight > 50) {
            cost += 45;
        }
        return cost * weight;

    }

    @Override
    public double additionalDistanceCost(double distance) {
        double calculateKm = 0;
        if (distance <= 100) {
            calculateKm += 10;
        } else if (distance > 100 && distance >= 500) {
            calculateKm += 20;
        } else if (distance > 500) {
            calculateKm += 25;
        }
        return calculateKm * distance;
    }
}
