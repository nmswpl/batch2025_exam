package in.co.nmsworks;

public class AirShipping implements LogisticsManagement {
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
       double extra=Math.max(0, weight);
       double cost=0;
       if(extra<=10){
           cost=extra+50;
       } else if (extra<=20) {
           cost=(10*50)+(extra-10)+60;

       }else {
           cost=(10*50)+(10*60)+(extra-20);
       }

        return cost;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        double extra=Math.max(0, distance);
        double cost=0;
        if(extra<=500){
            cost=extra+20;
        } else if (extra<=1000) {
            cost=(500*20)+(extra-500)+40;

        }else {
            cost=(500*50)+(500*20)+(extra-100);
        }


        return cost;
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
