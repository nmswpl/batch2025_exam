package in.co.nmsworks.exam.logisticsmanagement;

public class LandShipping implements ShippingMethod {

    @Override
    public double getBasePrice() {
        return 8;
    }

    @Override
    public double getBaseWeight() {
        return 4;
    }

    @Override
    public double getBaseDistance() {
        return 250;
    }

    @Override
    public double additionalWeightCost(double weight) {
        double additional = weight - getBaseWeight();
        if(additional <= 5) {
            return additional * 10;
        } else if (additional <= 15 && additional >= 5) {
            return additional * 15;
        }
        return additional * 20;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        double additional = distance - getBaseDistance();
        if(additional <= 300) {
            return additional * 20;
        } else if (additional >= 300 && additional <= 700) {
            return additional * 30;
        }
        return additional * 35;
    }
}
