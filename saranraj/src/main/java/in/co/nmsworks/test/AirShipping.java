package in.co.nmsworks.test;

public class AirShipping implements ShippingMethod {
    private double weight;
    private double cost;
    private double distance;

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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getBasePrice() {
        return 10;
    }

    @Override
    public double getBaseWeight() {
        return 2;
    }

    @Override
    public double getBaseDistance() {
        return 20;
    }

    @Override
    public double additionalWeightCost(double weight) {

        if (weight <= 10) {
            cost += 50;
        } else if (weight > 10 && weight >= 20) {
            cost += 60;
        } else if (weight > 20) {
            cost += 70;
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

    public double getPrice() {
        return cost;
    }

    public void setPrice(double cost) {
        this.cost = cost;
    }
}
