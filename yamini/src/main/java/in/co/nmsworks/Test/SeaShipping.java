package in.co.nmsworks.Test;

public class SeaShipping extends Parcel implements ShippingMethods{
    double basicPrice;
    double baseDistance;
    double baseWeight;

    public void setBaseDistance(double baseDistance) {
        this.baseDistance = baseDistance;
    }


    public void setBaseWeight(double baseWeight) {
        this.baseWeight = baseWeight;
    }

    public void setBasicPrice(double basicPrice) {
        this.basicPrice = basicPrice;
    }

    @Override
    public double getBasicPrice() {
        return basicPrice;
    }

    @Override
    public double getBaseWeight() {
        return baseWeight;
    }

    @Override
    public double getBaseDistance() {
        return distance;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        double addDistance = distance - baseDistance;
        if(addDistance <= 100){
            return  addDistance * 10;
        } else if (addDistance <= 500 && addDistance >= 100) {
            return  addDistance * 20;
        }
        return  addDistance * 25;
    }

    @Override
    public double additionalWeight(double weight) {
        double addWeight = weight - baseWeight;
       if(addWeight <= 25){
           return  addWeight * 30;

       } else if (addWeight > 25 && addWeight < 50) {
           return addWeight * 40;

       }
       return addWeight * 45;
    }



}
