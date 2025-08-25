package in.co.nmsworks.test;

public class Airshipping implements ShippingMethod{
    @Override
    public double additionalDistanceCost(double distance) {
        if (distance <= 500){
                return 20 * distance;
        }
        else if (distance > 500  && distance <= 1000){
            return 40 * distance;
        }
        else {
            return 50 * distance;
        }
    }

    @Override
    public double additionalWeightCost(double weight) {
        if ( weight <= 10){
            return 50 * weight;
        }
        else if (weight > 10 && weight <= 20)
        {
            return 60 * weight;
        }
        else {
            return 70 * weight;
        }
    }

    @Override
    public double getBaseDistance() {
        return 500;
    }

    @Override
    public double getBaseWeight() {
        return 35;
    }

    @Override
    public double getPrice() {
        return 25;
    }
}
