package in.co.nmsworks.Exam;

public class ShippingCostCalculator
{

    public static void main(String[] args) {


        ShippingCostCalculator scc =new ShippingCostCalculator();
        ShippingMethod as = new AirShipping();
        ShippingMethod ls = new LandShipping();
        ShippingMethod ss = new SeaShipping();

        Parcel pp = new Parcel();

        scc.calculateTotalCost(as,pp);
    }




    public void calculateTotalCost(ShippingMethod shippingMethod, Parcel parcel)
    {






    }




}
