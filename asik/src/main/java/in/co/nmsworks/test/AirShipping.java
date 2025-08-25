package in.co.nmsworks.test;

public class AirShipping implements ShippingMethod
{
    private double basePrice;
    private double baseWeight;
    private double baseDistance;


    public AirShipping(double basePrice, double baseWeight, double baseDistance)
    {
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
    public double additionalWeightCost(double weight)
    {
        if (weight <= 10)
        {
            return weight * 50;
        }
        else if (weight > 10 && weight < 20)
        {
            return weight * 60;
        }
        return weight * 70;
    }

    @Override
    public double additionalDistanceCost(double distance)
    {
        if (distance <= 500)
        {
            return distance * 20;
        }
        else if (distance > 500 && distance < 1000)
        {
            return distance * 40;
        }
        return distance * 50;
    }
}
