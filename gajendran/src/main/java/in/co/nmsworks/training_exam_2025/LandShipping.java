package in.co.nmsworks.training_exam_2025;

public class LandShipping implements ShippingMethod
{
    @Override
    public double getBasePrice() {
        return 0;
    }

    @Override
    public double getBaseWeight() {
        return 0;
    }

    @Override
    public double getBaseDistance() {
        return 0;
    }

    @Override
    public double additionalWeightCost(double weight)
    {
        double cost;
        if (weight <= 5 ){
            return weight * 10;
        }else if (weight <= 15){
            return weight * 15;
        }
        return weight * 20;
    }

    @Override
    public double additionalDistanceCost(double distance) {

        if (distance <= 300 ){
            return distance * 20;
        }else if (distance <= 700){
            return distance * 30;
        }
        return distance * 35;
    }
}
