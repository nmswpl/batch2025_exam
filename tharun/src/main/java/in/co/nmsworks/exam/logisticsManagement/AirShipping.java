package in.co.nmsworks.exam.logisticsManagement;

public class AirShipping implements ShippingMethod{
    private double basePrice;
    private double baseWeight;
    private double baseDistance;

    public AirShipping(double basePrice, double baseWeight, double baseDistance) {
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
            if ( weightDifference <= 10){
                return this.basePrice + (50 * weightDifference);
            }
            else if (weightDifference > 10 && weightDifference <= 20) {
                return this.basePrice + (60 * weightDifference);
            }
            else {
                return this.basePrice + (70 * weightDifference);
            }
        }
        return this.basePrice;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (this.baseDistance < distance){
            double distanceDifference = (distance - this.baseDistance);
            if ( distanceDifference <= 500){
                return this.basePrice + (20 * distanceDifference);
            }
            else if (distanceDifference > 500 && distanceDifference <= 1000) {
                return this.basePrice + (40 * distanceDifference);
            }
            else {
                return this.basePrice + (50 * distanceDifference);
            }
        }
        return this.basePrice;
    }
}
