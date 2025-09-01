package in.co.nmsworks.test;

public class AirShipping implements ShippingMethod {
    @Override
    public double getBaseDistance() {
        return 300;
    }

    @Override
    public double getBaseWeight() {
        return 5;
    }

    @Override
    public double getBasePrice() {
        return 100;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (distance <= this.getBaseDistance()) {
            return this.getBasePrice();
        } else if (distance > this.getBaseDistance() && distance <= 800) {
            double distanceRemaining = distance - this.getBaseDistance();
            return this.getBasePrice()  + (distanceRemaining * 20);
        } else if (distance > 800 && distance <= 1300) {
            double distanceRemaining = distance - (this.getBaseDistance() + 500);
            return this.getBasePrice() + (500 * 20) + (distanceRemaining * 40);
        } else {
            double distanceRemaining = distance - (this.getBaseDistance() + 500 + 500);
            return this.getBaseDistance() + (500 * 20) + (500 * 40) + (distanceRemaining * 50);
        }
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight <= this.getBaseWeight()) {
            return this.getBasePrice();
        } else if (weight > this.getBaseWeight() && weight <= 15) {
            double weightRemaining = weight - this.getBaseWeight();
            return this.getBasePrice() + (weightRemaining * 50);
        } else if (weight > 15 && weight <= 25) {
            double weightRemaining = weight - (this.getBaseWeight() + 10);
            return this.getBasePrice() + (10 * 50) + (weightRemaining * 60);
        } else {
            double weightRemaining = weight - (this.getBaseWeight() + 10 + 10);
            return this.getBasePrice() + (10 * 50) + (10 * 60) + (weightRemaining * 70);
        }
    }
}
