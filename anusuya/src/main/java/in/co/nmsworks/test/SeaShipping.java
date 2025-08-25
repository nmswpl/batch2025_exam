package in.co.nmsworks.test;

public class SeaShipping extends Parcel implements ShippingMethod{

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
        return super.getWeight();
    }

    @Override
    public double getBaseDistance() {
        return super.getDistance();
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight < 25){
            return getBaseWeight()+(weight*30);
        }
        if (weight > 20 && weight < 50){
            return getBaseWeight()+(weight*40);
        }
        if (weight > 50){
            return  getBaseWeight()+(weight*45);
        }
        return 0;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (distance < 100){
            return getBaseDistance()+(distance*10);
        }
        if (distance > 100 && distance < 500){
            return getBaseDistance()+(distance*20);
        }
        if (distance > 500){
            return  getBaseDistance()+(distance*25);
        }
        return 0;
    }
}
