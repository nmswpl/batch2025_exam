package in.co.nmsworks.training_exam_2025;

public class SeaShipping implements ShippingMethod
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

    public double additionalWeightCost(double weight)
    {
        double cost;
        if (weight <= 25 ){
            return weight * 30;
        }else if (weight <= 50){
            return weight * 40;
        }
        return weight * 45;
    }

    @Override
    public double additionalDistanceCost(double distance) {

        if (distance <= 100 ){
            return distance * 10;
        }else if (distance <= 500){
            return distance * 20;
        }
        return distance * 25;
    }
}
