package in.co.nmsworks.test;

public class AirShipping  implements ShippingMethod{

    private double basePrice;

    public AirShipping(double basePrice){
        this.basePrice = basePrice;
    }

    @Override
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getBaseWeight() {
        return 5;
    }

    @Override
    public double getBaseDistance() {
        return 100;
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight < getBaseWeight()){
            return weight;
        }
        else{
            if (weight <= 10){
                return getBaseWeight()+((weight-getBaseWeight())*50);
            }
            if (weight > 10 && weight < 20){
                return getBaseWeight()+((weight-getBaseWeight())*60);
            }
            if (weight > 20){
                return getBaseWeight()+((weight-getBaseWeight())*70);
            }
        }
        return 0;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (distance < getBaseDistance()){
            return distance;
        }
        else{
            if (distance < 500){
                return distance+((distance-getBaseDistance())*20);
            }
            if (distance > 500 && distance < 1000){
                return distance+((distance-getBaseDistance())*40);
            }
            if (distance > 1000){
                return distance+((distance-getBaseDistance())*50);
            }
        }
        return 0;
    }
}
