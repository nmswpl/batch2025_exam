package in.co.nmsworks.test;

public class SeaShipping implements ShippingMethod
{
    private double basePrice;
    private double baseWeight;
    private double baseDistance;

    public SeaShipping(double basePrice, double baseWeight, double baseDistance)
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
        if (weight <= 25)
        {
            return weight * 30;
        }
        else if (weight > 25 && weight < 50)
        {
            return weight * 40;
        }
        return weight * 45;
    }

    @Override
    public double additionalDistanceCost(double distance)
    {
        if (distance <= 100)
        {
            return distance * 10;
        }
        else if (distance > 100 && distance < 500)
        {
            return distance * 20;
        }
        return distance * 25;
    }
}
