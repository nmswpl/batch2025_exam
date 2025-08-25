package in.co.nmsworks.test;


class LandShipping implements ShippingMethod {

    public double getBasePrice() {
        return 70;
    }

    public double getBaseWeight() {
        return 8;
    }

    public double getBaseDistance() {
        return 100;
    }

    public double additionalWeightCost(double weight) {
        double additional = weight - getBaseWeight();
        if (additional <= 0) {
            return 0;
        }


        return additional*40;
    }

    public double additionalDistanceCost(double distance) {
        double additional = distance - getBaseDistance();
        if (additional <= 0) {
            return 0;
        }
        return additional*15;

    }
}

