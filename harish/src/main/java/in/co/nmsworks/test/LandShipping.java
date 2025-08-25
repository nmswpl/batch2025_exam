package in.co.nmsworks.test;

public class LandShipping implements ShippingMethod{
    @Override
    public double additionalDistanceCost(double distance) {
        if (distance <= 300){
            return 20 * distance;
        }
        else if (distance > 300  && distance <= 700){
            return 30 * distance;
        }
        else {
            return 35 * distance;
        }
    }

    @Override
    public double additionalWeightCost(double weight) {
        if ( weight <= 5){
            return 10 * weight;
        }
        else if (weight > 5 && weight <= 15)
        {
            return 15 * weight;
        }
        else {
            return 20 * weight;
        }
    }

    @Override
    public double getBaseDistance() {
        return 455;
    }

    @Override
    public double getBaseWeight() {
        return 50;
    }

    @Override
    public double getPrice() {
        return 255;
    }
}
