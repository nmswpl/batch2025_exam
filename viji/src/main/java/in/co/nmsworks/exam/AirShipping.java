package in.co.nmsworks.exam;

public abstract class AirShipping implements ShippingMethod{
    private double weightCost ;

    public AirShipping(double weightCost) {
        this.weightCost = weightCost;
    }

    public double getWeightCost() {
        return weightCost;
    }

    @Override
    public double additionalWeightCost(double weight) {
        if(weightCost == 50.0 ){
           return  weightCost += 10 ;
        }
        else if (weightCost >=10 && weightCost <=20 ){
            return  weightCost += 60 ;
        }
        else if(weightCost > 20){
            return  weightCost += 70;
        }
    }

    @Override
    public double additionalDistanceCost(double distance) {
        return 0;
    }
}
