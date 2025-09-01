package in.co.nmsworks.test;

public class LandShipping implements ShippingMethod {
    @Override
    public double getBaseDistance() {
        return 100;
    }

    @Override
    public double getBaseWeight() {
        return 5;
    }

    @Override
    public double getBasePrice() {
        return 120;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (distance <= this.getBaseDistance()) {
            return this.getBasePrice();
        } else if (distance > this.getBaseDistance() && distance <= 400) {
            double distanceRemaining = distance - this.getBaseDistance();
            return this.getBasePrice()  + (distanceRemaining * 20);
        } else if (distance > 400 && distance <= 800) {
            double distanceRemaining = distance - (this.getBaseDistance() + 300);
            return this.getBasePrice() + (300 * 20) + (distanceRemaining * 30);
        } else {
            double distanceRemaining = distance - (this.getBaseDistance() + 300 + 400);
            return this.getBasePrice() + (300 * 20) + (400 * 30) + (distanceRemaining * 35);
        }
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight <= this.getBaseWeight()) {
            return this.getBasePrice();
        } else if (weight > this.getBaseWeight() && weight <= 10) {
            double weightRemaining = weight - this.getBaseWeight();
            return this.getBasePrice() + (weightRemaining * 10);
        } else if (weight > 10 && weight <= 20) {
            double weightRemaining = weight - (this.getBaseWeight() + 5);
            return this.getBasePrice() + (5 * 10) + (weightRemaining * 15);
        } else {
            double weightRemaining = weight - (this.getBaseWeight() + 5 + 10);
            return this.getBasePrice() + (5 * 10) + (10 * 15) + (weightRemaining * 20);
        }
    }
}
