package in.co.nmsworks.test;

public class SeaShipping implements ShippingMethod{

    private double basePrice;

    public SeaShipping(double basePrice){
        this.basePrice = basePrice;
    }

    @Override
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getBaseWeight() {
        return 10;
    }

    @Override
    public double getBaseDistance() {
        return 30;
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight < getBaseWeight()){
            return weight;
        }
        else{
            if (weight < 25){
                return getBaseWeight()+((weight-getBaseWeight())*30);
            }
            if (weight > 25 && weight < 50){
                return getBaseWeight()+((weight-getBaseWeight())*40);
            }
            if (weight > 50){
                return getBaseWeight()+((weight-getBaseWeight())*45);
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
            if (distance < 100){
                return distance+((distance-getBaseDistance())*10);
            }
            if (distance > 100 && distance < 500){
                return distance+((distance-getBaseDistance())*20);
            }
            if (distance > 500){
                return distance+((distance-getBaseDistance())*25);
            }
        }
        return 0;
    }
}
