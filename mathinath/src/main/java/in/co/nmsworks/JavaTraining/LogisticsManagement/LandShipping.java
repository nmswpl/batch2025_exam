package in.co.nmsworks.JavaTraining.LogisticsManagement;

public class LandShipping implements ShippingMethod{
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
        if (weight < 5)
        {
            cost +=10;
        }
        else if(weight >5 && weight<=15)
        {
            cost+=15;
        }
        else
        {
            cost+=20;
        }
        return cost;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (distance < 300)
        {
            cost+=20;
        }
        else if(distance > 300 && distance < 700)
        {
            cost+=30;
        }
        else
        {
            cost+=75;
        }
        return cost;
    }
}
