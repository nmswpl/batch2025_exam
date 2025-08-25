package in.co.nmsworks.exam.logisticsmanagement;

public class SeaShipping implements ShippingMethod{

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
    public double additionalWeightCost(double weight) {
        double add = weight - getBaseWeight();
        if(add <= 25) {
            return add * 30;
        } else if (add > 25 && add <= 50) {
            return add * 40;
        }
        return add * 45;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        double add = distance - getBaseDistance();
        if(add <= 100) {
            return  add * 10;
        }
        else if(add <= 500 && add > 100) {
            return add * 20;
        }
        return add * 25;
    }
}
