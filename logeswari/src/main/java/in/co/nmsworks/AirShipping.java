package in.co.nmsworks;

public class AirShipping implements LogisticsManagement{
    int price=20;
    int baseWeight=2;
    int distance=400;
    int additionalDistance=2;


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
        return 0;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        return 0;
    }

    @Override
    public String toString() {
        System.out.println("AirShipping : "+(price+baseWeight+distance+additionalDistance));
        return "AirShipping{" +
                "price=" + price +
                ", baseWeight=" + baseWeight +
                ", distance=" + distance +
                ", additionalDistance=" + additionalDistance +
                '}';
    }
}
