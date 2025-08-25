package in.co.nmsworks;

public class AirShipping implements ShippingMethod {
    double basePrice = 200.57;
    double baseWeight = 150.00;
    double value = 100;
    double parcelDistanceInKm = 100;

    @Override
    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public double getBaseWeight() {

        if (baseWeight <= value) {
            System.out.println("No Additional cost for the Weight");
        } else {
            System.out.println("Additional coast for the weight you nedd to pay");
        }
        return 0;
    }

    @Override
    public double getBaseDistance() {
        if (parcelDistanceInKm <= value) {
            System.out.println("No Additional Distance Cost applied ");
        } else {
            System.out.println("Pay for additional cost :");
        }

        return basePrice;
    }

    @Override
    public double additionalWeightCost(double weight) {
        if (weight >= 10) {
            System.out.println("you want to pay " + weight + "additional [rs :50 per kg]");
        } else if (weight <= 10 && weight >= 20) {
            System.out.println("You want to pay " + weight + " additional [rs ;60 per kg]");
        } else {
            System.out.println("You want to Pay" + weight + " additional [rs: 70 Per kg");

        }

        return 0;
    }

    @Override
    public double additionalDistanceCost(double distance) {
        if (distance <= 500) {
            System.out.println("you need to pay additional " + distance + " km [rs:20 per km] ");
        } else if (distance >= 500 && distance <= 1000) {
            System.out.println("you need to pay aditional " + distance + " km [rs :40 per km]");
        } else {
            System.out.println("you need to pay additional " + distance + "km [rs; 50 per km]");
        }
        return 0;
    }
}
