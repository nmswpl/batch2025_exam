package in.co.nmsworks.exam.logisticsmanagement;

public class AirShipping implements ShippingMethod {

    @Override
    public double getBasePrice() {
        return 10;
    }

    @Override
    public double getBaseWeight() {
        return 10;
    }

    @Override
    public double getBaseDistance() {
        return 500;
    }

    @Override
    public double additionalWeightCost(double weight) {
        double additionalWeight = weight - getBaseWeight();
        if(additionalWeight < 10) {
            return additionalWeight*50;
        }
        else if((additionalWeight <= 20) && (additionalWeight >= 10) {
            return additionalWeight * 60;
        }
        else {
            return additionalWeight * 70;
        }
    }

    @Override
    public double additionalDistanceCost(double distance) {
        double additionalDistance = distance - getBaseDistance();
        if(additionalDistance < 500) {
            return additionalDistance * 20;
        }
        else if((additionalDistance <= 1000) && (additionalDistance >= 500)) {
            return additionalDistance * 40;
        }
        else {
            return additionalDistance * 50;
        }
    }
}
