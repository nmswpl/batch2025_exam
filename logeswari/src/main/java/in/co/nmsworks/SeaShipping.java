package in.co.nmsworks;

public class SeaShipping implements  LogisticsManagement{
    int price=220;
    int baseWeight=20;
    int distance=800;
    int additionalDistance=5;
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
        System.out.println("SeaShipping : "+(price+baseWeight+distance+additionalDistance));
        return "SeaShipping{" +
                "price=" + price +
                ", baseWeight=" + baseWeight +
                ", distance=" + distance +
                ", additionalDistance=" + additionalDistance +
                '}';
    }
}
