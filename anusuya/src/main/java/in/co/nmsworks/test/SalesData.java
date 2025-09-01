package in.co.nmsworks.test;

import java.util.Objects;

public class SalesData {

    private String salesId;
    private String productName;
    private String category;
    private double price;
    private int noOfItemSold;
    private String salesDate;

    SalesData(){}

    public SalesData (String salesId, String productName, String category, double price, int noOfItemSold, String salesDate){
        this.salesId = salesId;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.noOfItemSold = noOfItemSold;
        this.salesDate = salesDate;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getSalesId() {
        return salesId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setNoOfItemSold(int noOfItemSold) {
        this.noOfItemSold = noOfItemSold;
    }

    public int getNoOfItemSold() {
        return noOfItemSold;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public String getSalesDate() {
        return salesDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SalesData salesData = (SalesData) o;
        return Double.compare(price, salesData.price) == 0 && noOfItemSold == salesData.noOfItemSold && Objects.equals(salesId, salesData.salesId) && Objects.equals(productName, salesData.productName) && Objects.equals(category, salesData.category) && Objects.equals(salesDate, salesData.salesDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesId, productName, category, price, noOfItemSold, salesDate);
    }

    @Override
    public String toString() {
        return "SalesData{" +
                "salesId=" + salesId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", noOfItemSold=" + noOfItemSold +
                ", salesDate='" + salesDate + '\'' +
                '}';
    }
}
