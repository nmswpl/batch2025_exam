package in.co.nmsworks.test;

public class SeaShipping implements ShippingMethod {
    @Override
    public double getBaseDistance() {
        return 50;
    }

    @Override
    public double getBaseWeight() {
        return 10;
    }

    @Override
    public double getBasePrice() {
        return 1507;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (distance <= this.getBaseDistance()) {
            return this.getBasePrice();
        } else if (distance > this.getBaseDistance() && distance <= 150) {
            double distanceRemaining = distance - this.getBaseDistance();
            return this.getBasePrice() + (distanceRemaining * 10);
        } else if (distance > 150 && distance <= 550) {
            double distanceRemaining = distance - (this.getBaseDistance() + 100);
            return this.getBasePrice() + (100 * 10) + (distanceRemaining * 20);
        } else {
            double distanceRemaining = distance - (this.getBaseDistance() + 100 + 400);
            return this.getBasePrice() + (100 * 10) + (400 * 20) + (distanceRemaining * 25);
        }
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight <= this.getBaseWeight()) {
            return this.getBasePrice();
        } else if (weight > this.getBaseWeight() && weight <= 35) {
            double weightRemaining = weight - this.getBaseWeight();
            return this.getBasePrice() + (weightRemaining * 30);
        } else if (weight > 35 && weight <= 60) {
            double weightRemaining = weight - (this.getBaseWeight() + 25);
            return this.getBasePrice() + (25 * 30) + (weightRemaining * 40);
        } else {
            double weightRemaining = weight - (this.getBaseWeight() + 25 + 25);
            return this.getBasePrice() + (25 * 30) + (25 * 40) + (weightRemaining * 45);
        }
    }
}
