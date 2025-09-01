package in.co.nmsworks.exam.logisticsManagement;

public class LandShipping implements ShippingMethod{
    private double basePrice;
    private double baseWeight;
    private double baseDistance;

    public LandShipping(double basePrice, double baseWeight, double baseDistance) {
        this.basePrice = basePrice;
        this.baseWeight = baseWeight;
        this.baseDistance = baseDistance;
    }

    @Override
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getBaseWeight() {
        return baseWeight;
    }

    @Override
    public double getBaseDistance() {
        return baseDistance;
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (this.baseWeight < weight){
            double weightDifference = (weight - this.baseWeight);
            if ( weightDifference <= 5){
                return this.basePrice + (10 * weightDifference);
            }
            else if (weightDifference > 5 && weightDifference <= 15) {
                return this.basePrice + (15 * weightDifference);
            }
            else {
                return this.basePrice + (20 * weightDifference);
            }
        }
        return this.basePrice;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (this.baseDistance < distance){
            double distanceDifference = (distance - this.baseDistance);
            if ( distanceDifference <= 300){
                return this.basePrice + (20 * distanceDifference);
            }
            else if (distanceDifference > 300 && distanceDifference <= 700) {
                return this.basePrice + (30 * distanceDifference);
            }
            else {
                return this.basePrice + (35 * distanceDifference);
            }
        }
        return this.basePrice;
    }
}
