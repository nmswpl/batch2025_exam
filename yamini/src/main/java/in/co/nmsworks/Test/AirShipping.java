package in.co.nmsworks.Test;

public class AirShipping implements ShippingMethods{
    double basePrice;
    double baseWeight;
    @Override
    public double getBasicPrice() {
        return basePrice;
    }

    @Override


    public double getBaseWeight() {
        return baseWeight;
    }

    @Override
    public double getBaseDistance() {
        return 0;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if(distance<500) {
            return distance * 20;
        } else if (distance>500 && distance<1000) {
            return distance*40;

        }
        return distance*50;
    }

    @Override
    public double additionalWeight(double weight) {
        if(weight<=10){
            return weight*50;
        } else if (weight>10 && weight <20) {
            return weight*60;
        }
        return weight*70;
    }
}
