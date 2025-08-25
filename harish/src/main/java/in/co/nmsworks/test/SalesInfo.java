package in.co.nmsworks.test;

import java.util.Objects;

public class SalesInfo {
    private String salesId;
    private String productName;
    private String category;
    private double price;
    private int itemSold;
    private String date;

    public SalesInfo(String salesId, String productName, String category, double price, int itemSold, String date) {
        this.date = date;
        this.price = price;
        this.itemSold = itemSold;
        this.category = category;
        this.productName = productName;
        this.salesId = salesId;
    }
    public SalesInfo(){

    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SalesInfo{" +
                "salesId='" + salesId + '\'' +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", itemSold=" + itemSold +
                ", date='" + date + '\'' +
                '}';
    }

    public int getItemSold() {
        return itemSold;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SalesInfo salesInfo = (SalesInfo) o;
        return price == salesInfo.price && itemSold == salesInfo.itemSold && Objects.equals(salesId, salesInfo.salesId) && Objects.equals(productName, salesInfo.productName) && Objects.equals(category, salesInfo.category) && Objects.equals(date, salesInfo.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salesId, productName, category, price, itemSold, date);
    }

    public void setItemSold(int itemSold) {
        this.itemSold = itemSold;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
