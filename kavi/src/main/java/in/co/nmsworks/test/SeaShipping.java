package in.co.nmsworks.test;

class SeaShipping implements ShippingMethod {

    public double getBasePrice() {
        return 50;
    }

    public double getBaseWeight() {
        return 10;
    }

    public double getBaseDistance() {
        return 50;
    }

    public double additionalWeightCost(double weight) {
        double additional = weight - getBaseWeight();
        if (additional <= 0) {
            return 0;
        }

        double cost = 0;
        if (additional <= 25) {
            cost = additional * 30;
        }
        else if (additional <= 50) {
            cost = 25 * 30 + (additional - 25) * 40;
        }
        else {
            cost = 25 * 30+(additional - 50) * 45;
        }
        return cost;
    }

    public double additionalDistanceCost(double distance) {
        double additional = distance - getBaseDistance();
        if (additional <= 0) {
            return 0;
        }

        double cost = 0;
        if (additional <= 100) {
            cost = additional * 10;
        }
        else if (additional <= 500) {
            cost = 100 * 10 + (additional - 100) * 20;
        }
        else {
            cost = 100 * 10 + (additional - 500) * 25;
        }
        return cost;
    }
}
