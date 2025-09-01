package in.co.nmsworks.revise;

public class Sale {
    private String sales_id;
    private String productName;
    private String category;
    private double price;
    private int itemsSold;
    private String saleDate;

    public Sale(String sales_id, String productName, String category, double price, int itemsSold, String saleDate) {
        this.sales_id = sales_id;
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.itemsSold = itemsSold;
        this.saleDate = saleDate;
    }

    public String getSales_id() {
        return sales_id;
    }

    public void setSales_id(String sales_id) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(int itemsSold) {
        this.itemsSold = itemsSold;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "sales_id=" + sales_id +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", itemsSold=" + itemsSold +
                ", saleDate='" + saleDate + '\'' +
                '}';
    }
}
