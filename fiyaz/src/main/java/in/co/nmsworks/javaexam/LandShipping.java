package in.co.nmsworks.javaexam;

public class LandShipping implements ShippingMethod {
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
        double finalPrice = 0;
        if(weight <= 10) {
            finalPrice = 50;
        }
        else if (weight > 10 || weight > 20) {
            finalPrice = 60;
        }
        else if (weight > 20 || weight > 70 ){
            finalPrice = 80;
        }
        return finalPrice;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        double finalDistanceP = 0;

        if (distance <= 500) {
            finalDistanceP = 20;
        }
        else if (distance > 500 || distance < 1000) {
            finalDistanceP = 40;
        }
        else if (distance < 1000) {
            finalDistanceP = 50;
        }

        return finalDistanceP;

    }
}
