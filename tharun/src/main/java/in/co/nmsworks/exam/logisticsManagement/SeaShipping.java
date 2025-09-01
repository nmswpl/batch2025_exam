package in.co.nmsworks.exam.logisticsManagement;

public class SeaShipping implements ShippingMethod{
    private double basePrice;
    private double baseWeight;
    private double baseDistance;

    public SeaShipping(double basePrice, double baseWeight, double baseDistance) {
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
            if ( weightDifference <= 25){
                return this.basePrice + (30 * weightDifference);
            }
            else if (weightDifference > 25 && weightDifference <= 50) {
                return this.basePrice + (40 * weightDifference);
            }
            else {
                return this.basePrice + (45 * weightDifference);
            }
        }
        return this.basePrice;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (this.baseDistance < distance){
            double distanceDifference = (distance - this.baseDistance);
            if ( distanceDifference <= 100){
                return this.basePrice + (10 * distanceDifference);
            }
            else if (distanceDifference > 100 && distanceDifference <= 500) {
                return this.basePrice + (20 * distanceDifference);
            }
            else {
                return this.basePrice + (25 * distanceDifference);
            }
        }
        return this.basePrice;
    }
}
