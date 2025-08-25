package in.co.nmsworks.test;

class AirShipping implements ShippingMethod {

    public double getBasePrice() {
        return 100;
    }

    public double getBaseWeight() {
        return 5;
    }

    public double getBaseDistance() {
        return 200;
    }

    public double additionalWeightCost(double weight) {
        double additional = weight - getBaseWeight();
        if (additional <= 0){
            return 0;
        }

        double cost = 0;
        if (additional <= 10) {
            cost = additional * 50;
        }
        else if (additional <= 20) {
            cost = 10 * 50 + (additional - 10) * 60;
        }
        else {
            cost = 10 * 50 +(additional - 20) * 70;
        }
        return cost;
    }

    public double additionalDistanceCost(double distance) {
        double additional = distance - getBaseDistance();
        if (additional <= 0) {
            return 0;
        }

        double cost = 0;
        if (additional <= 300) {
            cost = additional * 20;
        }
        else if (additional <= 700) {
            cost = 300 * 20 + (additional - 300) * 30;
        }
        else {
            cost = 300 * 20 + (additional- 700) * 35;
        }
        return cost;
    }
}

