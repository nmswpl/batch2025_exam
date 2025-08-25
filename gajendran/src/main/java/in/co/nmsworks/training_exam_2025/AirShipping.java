package in.co.nmsworks.training_exam_2025;

public class AirShipping implements ShippingMethod
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
        if (weight <= 10 ){
            return weight * 50;
        }else if (weight <= 20){
            return weight * 60;
        }
        return weight * 70;
    }

    @Override
    public double additionalDistanceCost(double distance)
    {

            if (distance <= 500 ){
                return distance * 20;
            }else if (distance <= 1000){
                return distance * 40;
            }
            return distance * 50;

    }
}
