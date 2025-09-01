package in.co.nmsworks.test;

public class LandShipping implements ShippingMethod{

    private double basePrice;

    public LandShipping(double basePrice){
        this.basePrice = basePrice;
    }

    @Override
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getBaseWeight() {
        return 2;
    }

    @Override
    public double getBaseDistance() {
        return 50;
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight < getBaseWeight()){
            return weight;
        }
        else{
            if (weight < 5){
                return getBaseWeight()+((weight-getBaseWeight())*10);
            }
            if (weight > 5 && weight < 15){
                return getBaseWeight()+((weight-getBaseWeight())*15);
            }
            if (weight > 15){
                return getBaseWeight()+((weight-getBaseWeight())*20);
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
            if (distance < 300){
                return distance+((distance-getBaseDistance())*20);
            }
            if (distance > 300 && distance < 700){
                return distance+((distance-getBaseDistance())*30);
            }
            if (distance > 700){
                return distance+((distance-getBaseDistance())*35);
            }
        }
        return 0;
    }
}