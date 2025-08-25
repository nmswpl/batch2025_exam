package in.co.nmsworks.exam;

public class SalesInfo {
    private int salesId;
    private String productName;
    private String category ;
    private int price ;
    private int items_sold ;
    private int  salesDate ;

    public SalesInfo(int salesId, String productName, String category, int price, int items_sold, int salesDate) {
        this.salesId = salesId;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.items_sold = items_sold;
        this.salesDate = salesDate;
    }

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
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

    public void setPrice(int price) {
        this.price = price;
    }

    public int getItems_sold() {
        return items_sold;
    }

    public void setItems_sold(int items_sold) {
        this.items_sold = items_sold;
    }

    public int getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(int salesDate) {
        this.salesDate = salesDate;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "salesId=" + salesId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", items_sold=" + items_sold +
                ", salesDate=" + salesDate +
                '}';
    }
}
