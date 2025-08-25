package in.co.nmsworks.Exam;

public class AirShipping implements ShippingMethod{

   private int additionalCost;


    @Override
    public double getBasePrice() {
        return 500;
    }

    @Override
    public double getBaseWeight() {
        return 50;
    }

    @Override
    public double getBaseDistance() {
        return 150;
    }

    @Override
    public double additionalWeightCost(double weight) {

        if(weight<getBaseWeight())
        {
            additionalCost=0;
            return weight*getBasePrice()+additionalCost;
        }
        else if(weight>getBaseWeight())
        {
            double balanceWeight = weight-getBaseWeight();

            if(balanceWeight>20)
            {
//                balanceWeight*balanceWeight;
            }
        }
        return 0;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        return 0;
    }
}
