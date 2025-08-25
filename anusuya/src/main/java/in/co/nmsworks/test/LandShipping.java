package in.co.nmsworks.test;

public class LandShipping extends Parcel implements ShippingMethod{

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
        return super.getWeight();
    }

    @Override
    public double getBaseDistance() {
        return super.getDistance();
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight < 5){
            return getBaseWeight()+(weight*10);
        }
        if (weight > 5 && weight < 15){
            return getBaseWeight()+(weight*15);
        }
        if (weight > 15){
            return  getBaseWeight()+(weight*20);
        }
        return 0;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (distance < 300){
            return getBaseDistance()+(distance*20);
        }
        if (distance > 300 && distance < 700){
            return getBaseDistance()+(distance*30);
        }
        if (distance > 700){
            return  getBaseDistance()+(distance*35);
        }
        return 0;
    }
}
