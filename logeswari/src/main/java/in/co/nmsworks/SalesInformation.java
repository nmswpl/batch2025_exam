package in.co.nmsworks;

import java.util.Objects;

public class SalesInformation {
    private int sales_id;
    private String productName;
    private String category;
    private int price;
    private int date;
    private int items_sold;

    public SalesInformation(int sales_id, String productName, String category, int price, int date) {
        this.sales_id = sales_id;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.date = date;
    }

    public SalesInformation(int salesId, String productName, double v, int price, int date) {

    }

    public int getSales_id() {
        return sales_id;
    }

    public void setSales_id(int sales_id) {
        this.sales_id = sales_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SalesInformation that = (SalesInformation) o;
        return sales_id == that.sales_id && price == that.price && date == that.date && Objects.equals(productName, that.productName) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sales_id, productName, category, price, date);
    }

    @Override
    public String toString() {
        return "SalesInformation{" +
                "sales_id=" + sales_id +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public void CalculateAndPrint(){
        int calculate= Integer.parseInt(productName+price);
        System.out.println("CalculateAndPrint : "+ "/n" +"ProdactName : "+productName+"price : "+price);
    }

    public void findAndSalesInfo(int price,int sales_id ){

         int avgCalculation = items_sold * price;
        System.out.println("********");
        System.out.println("Average Calculation : "+avgCalculation);
        System.out.println("CalculateAndPrint : "+toString());
    }


}
