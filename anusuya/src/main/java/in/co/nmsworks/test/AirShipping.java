package in.co.nmsworks.test;

public class AirShipping extends Parcel implements ShippingMethod{

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
        return super.getWeight();
    }

    @Override
    public double getBaseDistance() {
        return super.getDistance()
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight < 10){
            return getBaseWeight()+(weight*50);
        }
        if (weight > 10 && weight < 20){
            return getBaseWeight()+(weight*60);
        }
        if (weight > 20){
            return  getBaseWeight()+(weight*70);
        }
        return 0;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (distance < 500){
            return getBaseDistance()+(distance*20);
        }
        if (distance > 500 && distance < 1000){
            return getBaseDistance()+(distance*40);
        }
        if (distance > 1000){
            return  getBaseDistance()+(distance*50);
        }
        return 0;
    }
}
