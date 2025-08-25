package in.co.nmsworks.test;

public class SalesData {
    private String salesId;
    private String productName;
    private String Category;
    private float price;
    private int itemsSold;
    private String date;



    public SalesData(String salesId,  String productName, String category, float price, int itemsSold, String date) {
        this.salesId = salesId;
        this.Category = category;
        this.productName = productName;
        this.price = price;
        this.itemsSold = itemsSold;
        this.date = date;
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

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(int itemsSold) {
        this.itemsSold = itemsSold;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
