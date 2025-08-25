package in.co.nmsworks.JavaTraining.LogisticsManagement;

public class AirShipping implements ShippingMethod{
    int cost ;
    int basePrice=1000;
    int baseWeight = 100;
    int baseDistance = 90;

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
        if(weight <= 10)
        {
            cost = cost + 50;
        } else if (weight > 10 && weight <= 20) {
            cost = cost + 60;
        }
        else
        {
            cost = cost + 70;
        }

        return cost;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if(distance <= 500)
        {
            cost = cost+20;
        }
        else if (distance > 500 && distance <=1000)
        {
            cost = cost+40;
        }
        else
        {
            cost = cost+50;
        }
        return cost;
    }
}
