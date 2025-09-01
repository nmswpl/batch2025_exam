package in.co.nmsworks;

public class ParcelRunner {
    private static Object AirShipping;
    private Object airparsal;

    public static void main(String[] args) {
        LogisticsManagement logisticsManagement=new AirShipping();
        System.out.println(logisticsManagement.toString());
        ParcelRunner parcel=new ParcelRunner();
        parcel.calculateTotalCost( logisticsManagement.toString(),parcel);

        parcel.generateQuotation(logisticsManagement.toString());

        LogisticsManagement logisticsManagement2=new SeaShipping();
        logisticsManagement2.toString();


    }

    public <ShippingMethod> void calculateTotalCost(ShippingMethod shippingMethod, ParcelRunner parcel){
        System.out.println("calculate total Shipping ");

    }
    public void generateQuotation(String parcel){



    }


}
