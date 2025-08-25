package in.co.nmsworks;

public class RunnerSalesDetails {
    public static void main(String[] args) {


       ReadSalesData readSalesData = new ReadSalesData(62 - 1937251, "Pet Training Clicker", 5.99, 90, 22 - 11 - 2024);
       readSalesData.readDate();
        SalesInformation salesInformation=new SalesInformation(62-1937251 ," Pet Training Clicker ", 5.99 , 90 , 22-11-2024);
        salesInformation.CalculateAndPrint();
        salesInformation.findAndSalesInfo(salesInformation.getPrice(), salesInformation.getSales_id());
        System.out.println("success******");
    }

}
